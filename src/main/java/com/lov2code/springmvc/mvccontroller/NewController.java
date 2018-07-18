package com.lov2code.springmvc.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController
{
    @RequestMapping("/")
    public String showMainMenu()
    {
        return "main-menu";
    }
}
