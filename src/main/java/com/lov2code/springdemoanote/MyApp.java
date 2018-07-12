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

        //if bean id name is not specified in the component(...)
        //then default bean id is made up by spring called "tennisCoach"
        Coach c = context.getBean( "tennisCoach", Coach.class );

        /*
        of no qualifiers are set:
        Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        No qualifying bean of type 'com.lov2code.springdemoanote.FortuneService' available:
        expected single matching bean but found 2: happyFortuneService,randomFortuneService
         */

        System.out.println(c.getDailyWorkOut());
    }
}
