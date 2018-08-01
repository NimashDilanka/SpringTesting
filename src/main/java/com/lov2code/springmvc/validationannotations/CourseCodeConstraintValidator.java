package com.lov2code.springmvc.validationannotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCodeValidation,String>
{
    //ConstraintValidator<CourseCodeValidation,String>
    //<name of validaion interface,ype of attribute which validation applies>


    //for my use create some variables
    private String[] value;
    private String message;
    @Override public void initialize( CourseCodeValidation courseCodeValidationObj )
    {
        //what to do before start validating process
        value=courseCodeValidationObj.value();
        message=courseCodeValidationObj.message();
    }

    @Override public boolean isValid( String theCourseCode, ConstraintValidatorContext constraintValidatorContext )
    {
        //this is where we check validation logic
        //if string which get validated starts with given value, pass the test
        if( theCourseCode == null )
        {
            return false;
        }
        for( String i : value )
        {
            if( theCourseCode.startsWith( i ) )
            {
                return true;
            }
        }
        return false;
    }
}
