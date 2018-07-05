package com.lov2code.springdemo;

public class HappyFortuneService implements FortuneService
{
    @Override public String getFortuneService()
    {
        return "Today is a lucky day";
    }
}
