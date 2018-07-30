package com.lov2code.springmvc.mvcvalidator;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Component
public class Person
{
    //adding validation relus to Person class
    //making filling this field is a required one
    @NotNull(message = "value is required")
    @Size(min = 2, message = "minimum 2 character required")
    private String name;


    private int age;


    //region GETTER_SETTER
    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge( int age )
    {
        this.age = age;
    }
    //endregion
}
