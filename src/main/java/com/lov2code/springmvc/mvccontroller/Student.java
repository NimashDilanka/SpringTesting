package com.lov2code.springmvc.mvccontroller;

import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

@Component
public class Student
{
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String,String> countryOptions;
    private LinkedHashMap<String,String> favouriteLanguageOptions;
    private String favouriteLanguage;

    public Student()
    {
        this.countryOptions = populateCountryOptions();
        this.favouriteLanguageOptions = populatefavLanguageOptions();
    }

    private LinkedHashMap<String,String> populateCountryOptions()
    {
        LinkedHashMap<String, String> out = new LinkedHashMap<>();
        out.put( "IN", "INDIA" );
        out.put( "SR", "SRI LANKA" );
        out.put( "AM", "AMERICA" );
        return out;
    }
    private LinkedHashMap<String,String> populatefavLanguageOptions()
    {
        LinkedHashMap<String, String> out = new LinkedHashMap<>();
        out.put( "PERL", "PERL" );
        return out;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry( String country )
    {
        this.country = country;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public LinkedHashMap<String, String> getCountryOptions()
    {
        return countryOptions;
    }

    public void setCountryOptions( LinkedHashMap<String, String> countryOptions )
    {
        this.countryOptions = countryOptions;
    }

    public String getFavouriteLanguage()
    {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage( String favouriteLanguage )
    {
        this.favouriteLanguage = favouriteLanguage;
    }

    public LinkedHashMap<String, String> getFavouriteLanguageOptions()
    {
        return favouriteLanguageOptions;
    }

    public void setFavouriteLanguageOptions( LinkedHashMap<String, String> favouriteLanguageOptions )
    {
        this.favouriteLanguageOptions = favouriteLanguageOptions;
    }
}
