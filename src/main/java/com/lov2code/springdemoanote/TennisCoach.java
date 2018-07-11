package com.lov2code.springdemoanote;

import com.lov2code.springdemo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//if bean id name is not specified in the component(...)
//then default bean id is made up by spring called "tennisCoach"
@Component
public class TennisCoach implements Coach
{
    private final FortuneService fortuneService;

    //As of Spring Framework 4.3, an @Autowired annotation on such a constructor is no longer necessary
    //if the target bean only defines one constructor to begin with. However, if several constructors are available,
    // at least one must be annotated to teach the container which one to use.I personally prefer to use the @Autowired
    // annotation because it makes the code more readable. But as mentioned, the @Autowired is not required for this scenario.
    //@Autowired  //constructor injection-auto wired by Happy fortune service
    public TennisCoach( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }
    @Override public String getDailyWorkOut()
    {
        return "\n\nget the tennis coach\n\n\n"+fortuneService.getFortuneService();
    }

    //adding a init method
    public void doStartupStuffFunction()
    {
        System.out.println("\n\ninitiate init function called");
    }

    //adding a destroy method
    public void doEndupStuffFunction()
    {
        System.out.println("\n\ndestroy method called");
    }
}
