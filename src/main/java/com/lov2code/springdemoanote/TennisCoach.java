package com.lov2code.springdemoanote;

import com.lov2code.springdemo.Coach;
import org.springframework.stereotype.Component;

@Component("myCoach")
public class TennisCoach implements Coach
{
    @Override public String getDailyWorkOut()
    {
        return "\n\nget the tennis coach\n\n\n";
    }

    //adding a init method
    public void doStartupStuffFunction()
    {
        System.out.println("\n\ninitiate init function called");
    }

    //adding a destroy method
    public void doEndupStuffFunction()
    {
        System.out.println("\n\ndestroy method called");
    }
}
