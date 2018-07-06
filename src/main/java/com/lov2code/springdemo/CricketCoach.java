package com.lov2code.springdemo;

public class CricketCoach implements Coach
{
    public FortuneService fortuneService;
    private String emailAddress;
    private String team;

    @Override public String getDailyWorkOut()
    {
        return "\n\n\ncricket coach get daily workout"+
                "team: "+team+
                "email address: "+emailAddress+"" +
                "\n\n\n";
    }

    public void setFortuneService( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress( String emailAddress )
    {
        this.emailAddress = emailAddress;
    }

    public void setTeam( String team )
    {
        this.team = team;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getTeam()
    {
        return team;
    }
}
