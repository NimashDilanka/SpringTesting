package com.lov2code.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//a configuration class. removing XML files
@Configuration
@PropertySource( "classpath:sport.properties" ) //adding a property file for config class
@ComponentScan("com.lov2code.configure")
public class SportConfig
{
    //define a bean for sad fortune service
    @Bean //bead id=sadFortuneService , same as method name
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }


    //define swm coach and inject dependency
    @Bean
    public Coach swimCoach(FortuneService fortuneService)
    {
        return new SwimCoach( sadFortuneService() );
    }



}
