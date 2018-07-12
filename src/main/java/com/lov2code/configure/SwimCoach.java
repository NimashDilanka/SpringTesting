package com.lov2code.configure;

public class SwimCoach implements Coach
{
    FortuneService fortuneService;

    public SwimCoach( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    @Override public String getDailyWorkOut()
    {
        return "\n\n\n swim coach\n\n\n"+fortuneService.getFortuneService();
    }
}
