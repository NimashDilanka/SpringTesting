package com.lov2code.springdemoanote;

import com.lov2code.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp
{
    public static void main( String[] args )
    {
        //load spring configeration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext( "applicationContextBeanLifeCycle.xml" );

        Coach c = context.getBean( "myCoach", Coach.class );

        System.out.println(c.getDailyWorkOut());
    }
}
