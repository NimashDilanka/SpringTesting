package com.lov2code.springmvc.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //creating controller class of MVC structure
public class HellowWorldController
{
    //now http://localhost:1010/SpringMVCWebApp/showFormRQ is a valid rq to server deployed by tomcat
    @RequestMapping("/showFormRQ")
    public String showFormMethod()
    {
        return "showFormJSP";
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
