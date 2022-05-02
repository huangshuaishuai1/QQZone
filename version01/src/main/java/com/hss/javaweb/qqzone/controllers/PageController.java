package com.hss.javaweb.qqzone.controllers;

import org.springframework.stereotype.Controller;

@Controller("page")
public class PageController {
    public String page(String page) {
        return page;
    }
}
