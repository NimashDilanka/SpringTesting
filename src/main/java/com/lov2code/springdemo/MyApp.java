package com.lov2code.springdemo;

public class MyApp
{
    public static void main( String[] args )
    {
        //create object
        Coach coach = new BaseBallCoach();
        Coach tcoach = new TrackCoach();

        //use the object
        System.out.println(coach.getDailyWorkOut());
        System.out.println(tcoach.getDailyWorkOut());
    }
}
