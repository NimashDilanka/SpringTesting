package com.lov2code.configure;

import com.lov2code.springdemo.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo
{


    public static void main( String[] args )
    {
        //read spring java configuration class
        AnnotationConfigApplicationContext context  =
                new AnnotationConfigApplicationContext( SportConfig.class );

        Coach c = context.getBean( "tennisCoach", Coach.class );
        System.out.println(c.getDailyWorkOut());
    }

}
