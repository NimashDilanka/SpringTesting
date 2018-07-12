package com.lov2code.springdemoanote;

import com.lov2code.springdemo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//if bean id name is not specified in the component(...)
//then default bean id is made up by spring called "tennisCoach"
@Component
public class TennisCoach implements Coach
{
    //using reflection, spring sets instance for this
    //no setter methods need
    //this is field injection
    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkOut()
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
