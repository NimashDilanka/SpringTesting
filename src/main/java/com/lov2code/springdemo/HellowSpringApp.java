package com.lov2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellowSpringApp
{
    public static void main( String[] args )
    {
        //load spring configeration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext( "applicationContext.xml" );

        //retrieve bean from spring container
        Coach theCoath = context.getBean( "myCoach", Coach.class );

        //call methos on the bean
        System.out.println(theCoath.getDailyWorkOut());

        //setter injection
        Coach cricketCoach = context.getBean( "myCricketCoach", Coach.class );

        //call setter injected object
        System.out.println(cricketCoach.getDailyWorkOut());

        //setter injection
        Coach cricketCoach2 = context.getBean( "myCricketCoach2", Coach.class );
        System.out.println(cricketCoach2.getDailyWorkOut());

        //close the context
        context.close();

    }
}
