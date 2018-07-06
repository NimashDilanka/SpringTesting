package com.lov2code.springdemo;

public class CricketCoach implements Coach
{
    public FortuneService fortuneService;
    @Override public String getDailyWorkOut()
    {
        return "\n\n\ncricket coach get daily workout\n\n\n";
    }

    public void setFortuneService( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }
}
