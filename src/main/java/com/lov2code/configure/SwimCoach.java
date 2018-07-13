package com.lov2code.configure;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach
{
    FortuneService fortuneService;
    @Value( "${foo.email}" )
    private String email;

    @Value( "${foo.team}" )
    private String team;

    public SwimCoach( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    @Override public String getDailyWorkOut()
    {
        return "\n\n\n swim coach\n\n\n"+fortuneService.getFortuneService()+email+team;
    }
}
