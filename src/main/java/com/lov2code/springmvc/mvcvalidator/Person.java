package com.lov2code.springmvc.mvcvalidator;

import com.lov2code.springmvc.validationannotations.CourseCodeValidation;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Component
public class Person
{
    //adding validation relus to Person class
    //making filling this field is a required one
    @NotNull(message = "value is required")
    @Size(min = 2, message = "minimum 2 character required")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "regex pattern not matched")
    private String name;

    @NotNull(message = "integer is required")
    @Min( value = 1,message = "number should be greater or equal to 1")
    @Max( value = 10,message = "number should be less or equal to 10")
    private Integer age;

    //creating a custom annotation in spring
    @CourseCodeValidation(value = "LUV", message = "must start with LUV")
    private String courseCode;


    //region GETTER_SETTER
    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge( Integer age )
    {
        this.age = age;
    }

    public String getCourseCode()
    {
        return courseCode;
    }

    public void setCourseCode( String courseCode )
    {
        this.courseCode = courseCode;
    }
    //endregion
}
