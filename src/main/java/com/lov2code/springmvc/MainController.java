package com.lov2code.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //creating contoller class of MVC structure
public class MainController
{
    //control method, any name with any parameter
    @RequestMapping("/") //match any
    public String showMyPage()
    {
        return "main-menu"; //returns the "view name" here
        //look at the spring-mvc-demo-servlet.xml
        //this will refer the file names /WEB-INF/view/main-menu.jsp
    }
}
