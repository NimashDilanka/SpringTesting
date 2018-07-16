package com.lov2code.springmvc.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller //creating controller class of MVC structure
public class HellowWorldController
{
    @RequestMapping("/")
    public String showMainPageMethod()
    {
        return "main-menu";
    }
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

    @RequestMapping("/toUpperRQ")
    public String toUpperFromMethod()
    {
        return "toUpperFromJSP";
    }

    @RequestMapping("/processUpperFormRQ")
    public String processUpperFormMethod( HttpServletRequest request, Model model )
    {
        //request has data came with GET RQ , model will be passed to returned view.
        String studentName = request.getParameter( "studentName" );
        studentName=studentName.toUpperCase();
        String s = "Yo! " + studentName;
        model.addAttribute( "massage",s );
        return "showUpperFromJSP";
    }

}
