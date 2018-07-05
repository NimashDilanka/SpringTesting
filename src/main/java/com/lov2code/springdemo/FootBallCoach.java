package com.lov2code.springdemo;

public class FootBallCoach implements Coach
{
    FortuneService fortuneService;

    public FootBallCoach( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    @Override public String getDailyWorkOut()
    {
        return "\n\n\nfootbal coacrh\n"+fortuneService.getFortuneService()+"\n\n";
    }
}
