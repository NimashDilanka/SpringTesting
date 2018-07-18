package com.lov2code.springmvc.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controlRQMap") //gave a parent mapping to call RQ calls under this class
public class NewController
{
    @RequestMapping("/")
    public String showMainMenu()
    {
        return "main-menu";
    }

    //now http://localhost:1010/SpringMVCWebApp/showFormRQ is a valid rq to server deployed by tomcat
    @RequestMapping("/showFormRQ")
    public String showFormMethod()
    {
        return "showFormJSPNew";
        //see spring-mvc-demo-serverlet.xml
        //this gets the bean related to showFromJSP.jsp file
    }

    //now http://localhost:1010/SpringMVCWebApp/showFormRQ is a valid rq to server deployed by tomcat
    @RequestMapping("/processFormRQ")
    public String processFormMethod()
    {
        return "processFormJSP";
    }
}
