package com.lov2code.springmvc.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/MVCForm")
public class MVCFormController
{
    @RequestMapping("/StudentController")
    public String getStudentForm( Model theModel )
    {
        Student s = new Student();
        theModel.addAttribute( "student",s );//attribute name, attribute value
        return "MVCFormTags/addPersonForm"; //return the view form name
    }

    @RequestMapping("/processMVCForm")
    public String getProcessForm( @ModelAttribute("student") Student s)
    {
        System.out.println("Logging input data: "+s.getFirstName()+" "+s.getLastName()+" "+s.getCountry());
        return "MVCFormTags/studentProcessForm";
    }

}
