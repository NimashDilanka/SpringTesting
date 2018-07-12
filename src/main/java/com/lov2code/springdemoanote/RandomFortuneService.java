package com.lov2code.springdemoanote;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService
{
    @Override public String getFortuneService()
    {
        return "Today is a random day";
    }
}
