package com.lov2code.springdemoanote;

import com.lov2code.springdemo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//if bean id name is not specified in the component(...)
//then default bean id is made up by spring called "tennisCoach"
@Component
public class TennisCoach implements Coach
{
    private FortuneService fortuneService;

    //sequence:
    /*
    1. Construct an instance of class
    2. Inject dependencies
    3. Set properties etc (@Value)
    */

    //set values froma file
    @Value( "${foo.email}" )
    private String email;
    @Value( "${foo.team}" )
    private String team;

    //need to set qualifier inside the constructor for constructor autowiring
    @Autowired
    public TennisCoach( @Qualifier("randomFortuneService") FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut()
    {
        return "\n\nget the tennis coach\n\n\n"+fortuneService.getFortuneService()+
                email+team;
    }

    //adding a init method
    @PostConstruct
    public void doStartupStuffFunction()
    {
        System.out.println("\n\ninitiate init function called");
    }

    //adding a destroy method
    @PreDestroy
    public void doEndupStuffFunction()
    {
        System.out.println("\n\ndestroy method called");
    }


}
