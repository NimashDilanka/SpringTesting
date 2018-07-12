package com.lov2code.configure;

import org.springframework.stereotype.Component;

//for spring to auto scan and find this annotation
//when spring find out implementations of FortuneServie it will find this.
@Component
public class SadFortuneService implements FortuneService
{
    @Override public String getFortuneService()
    {
        return "Today is a sad day";
    }
}
