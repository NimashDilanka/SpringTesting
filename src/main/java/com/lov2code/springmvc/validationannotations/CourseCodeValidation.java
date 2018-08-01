package com.lov2code.springmvc.validationannotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint( validatedBy = CourseCodeConstraintValidator.class) //where validation logic is placed
@Target( {ElementType.METHOD,ElementType.FIELD} ) //this annotation can be applied to a filed or a method
@Retention( RetentionPolicy.RUNTIME ) //process annotation at runtime
public @interface CourseCodeValidation
{
    //use case is like
    //@CourseCodeValidation(value = "LUV", message = "must start with LUV")

    //define default attributes
    public String value() default "defaultVal";
    public String message() default "defaultMessage";

    //define default groups
    public Class<?>[] groups() default {};

    //payload:provide custom details about validation failure(severity level,error etc)
    //define default payloads
    public Class<? extends Payload>[] payload() default {};


}
