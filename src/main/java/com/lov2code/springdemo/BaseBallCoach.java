package com.lov2code.springdemo;

public class BaseBallCoach implements Coach
{
    @Override
    public String getDailyWorkOut()
    {
        return "Spent 30 minutes";
    }
}
