package com.hss.javaweb.qqzone.servlet;

import com.hss.javaweb.qqzone.exception.DispatcherServletException;
import org.springframework.beans.factory.BeanFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@WebServlet("*.do")
public class DispatcherServlet extends ViewBaseServlet{
    private BeanFactory beanFactory;
    public DispatcherServlet() {

    }

    @Override
    public void init() throws ServletException {
        ServletContext application = getServletContext();
        Object beanFactoryObj = application.getAttribute("beanFactory");
        if (beanFactoryObj != null) {
            // 在监听器 application.setAttribute("beanFactory",beanFactoryObj)
            // ApplicationContext beanFactoryObj = new AnnotationConfigApplicationContext(SpringConfig.class); 这里的SpringConfig是自己创建的sping的配置类
            beanFactory = (BeanFactory) beanFactoryObj;
        }else {
            throw new RuntimeException("IOC容器获取失败");
        }

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath = req.getServletPath();
        servletPath = servletPath.substring(1);
        int lastDotIndex = servletPath.lastIndexOf(".do");
        servletPath = servletPath.substring(0,lastDotIndex);
        Object controllerBeanObj = beanFactory.getBean(servletPath);
        String operate = req.getParameter("operate");

        if (operate == null || "".equals(operate)) {
            operate="login";
        }

        try {
            Method[] methods = controllerBeanObj.getClass().getDeclaredMethods();

            for (Method method : methods) {
                if (operate.equals(method.getName())) {
                    Parameter[] parameters = method.getParameters();
                    Object[] parameterValues = new Object[parameters.length];
                    for (int i = 0; i < parameters.length; i++) {
                        Parameter parameter = parameters[i];
                        String parameterName = parameter.getName();
                        if ("request".equals(parameterName)) {
                            parameterValues[i] = req;
                        } else if ("response".equals(parameterName)) {
                            parameterValues[i] = resp;
                        } else if ("session".equals(parameterName)) {
                            parameterValues[i] = req.getSession();
                        } else {
                            String parameterValue = req.getParameter(parameterName);
                            String typeName = parameter.getType().getName();
                            Object parameterObj = parameterValue;
                            if (parameterObj != null) {
                                if ("java.lang.Integer".equals(typeName)) {
                                    parameterObj = Integer.parseInt(parameterValue);
                                }
                            }
                            parameterValues[i] = parameterObj;
                        }
                    }
                    method.setAccessible(true);

                    Object returnObj = method.invoke(controllerBeanObj, parameterValues);

                    String methodReturnStr = (String)returnObj ;
                    if(methodReturnStr.startsWith("redirect:")){        //比如：  redirect:fruit.do
                        String redirectStr = methodReturnStr.substring("redirect:".length());
                        resp.sendRedirect(redirectStr);
                    }else{
                        super.processTemplate(methodReturnStr,req,resp);    // 比如：  "edit"
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DispatcherServletException("DispatcherServlet出错了...");
        }



    }
}
