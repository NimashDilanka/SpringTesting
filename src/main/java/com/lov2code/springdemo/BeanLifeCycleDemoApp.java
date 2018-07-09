package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp
{
    public static void main( String[] args )
    {
        //load spring configeration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext( "applicationContextBeanLifeCycle.xml" );

        //retrieve bean from spring container
        Coach theCoath = context.getBean( "myinitCoach", Coach.class );
        System.out.println(theCoath.getDailyWorkOut());
    }

}
