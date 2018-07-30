package com.lov2code.springmvc.mvcvalidator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/MVCValidator")
public class SpringMVCValidateController
{
    @RequestMapping("/addPerson")
    public String getValidateFOrm(Model model)
    {
        Person p = new Person();
        model.addAttribute( "person",p );
        return "MVCValidate/addPersonForm";
    }

    @RequestMapping("/processPerson")
    public String processPerson( @Valid @ModelAttribute("person") Person thePerson, BindingResult theBindingResult )
    {
        //run validation tests upon given model attributes.then assign results to Binding result
        //When performing Spring MVC validation, the location of the BindingResult parameter is very important.
        //In the method signature, the BindingResult parameter must immediately after the model attribute.
        //If you place it in any other location, Spring MVC validation will not work as desired. In fact, your validation rules will be ignored.
        System.out.println("Name:|"+thePerson.getName()+"|");
        //if webapp is passed with several white spaces as input name for person, validations get passed !! this is a problem
        if( theBindingResult.hasErrors() )
        {
            return "MVCValidate/addPersonForm";
        }
        else
        {
            return "MVCValidate/addPersonSuccess";
        }
    }
}
