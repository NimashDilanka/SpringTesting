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


        //objects creation with prototype approach
        Coach pc1 = context.getBean( "myPrototypeCoach", Coach.class );
        Coach pc2 = context.getBean( "myPrototypeCoach", Coach.class );
        System.out.println(pc1.equals( pc2 ));

        //objects creation with singleton approach/default approach
        Coach pc3 = context.getBean( "mySingletonCoach", Coach.class );
        Coach pc4 = context.getBean( "mySingletonCoach", Coach.class );
        System.out.println(pc3.equals( pc4 ));

        //close the context
        context.close();

    }
}
