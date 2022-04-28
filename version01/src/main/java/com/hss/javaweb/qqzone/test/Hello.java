package com.hss.javaweb.qqzone.test;

import com.hss.javaweb.qqzone.config.SpringConfig;
import com.hss.javaweb.qqzone.controllers.UserController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Hello {
    public static void main(String[] args) {
//        BeanFactory beanFactory;
//        beanFactory = new AnnotationConfigApplicationContext(SpringConfig.class);
//        String servletPath = "/user.do";
//        servletPath = servletPath.substring(1);
//        int lastDotIndex = servletPath.lastIndexOf(".do");
//        servletPath = servletPath.substring(0,lastDotIndex);
//        Object controllerBeanObj = beanFactory.getBean(servletPath);
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Object user = annotationConfigApplicationContext.getBean("user");
        UserController userController = (UserController) user;


    }

}
