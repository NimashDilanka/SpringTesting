package com.lov2code.springdemo;

public class TrackCoach implements Coach
{

    @Override public String getDailyWorkOut()
    {
        return "\n\nget the massagetrack coach\n\n\n";
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
