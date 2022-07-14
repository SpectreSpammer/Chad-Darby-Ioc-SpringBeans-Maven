package com.chad.darby.constructorInjection;

import com.chad.darby.constructorInjection.FortuneService;
import com.chad.darby.ioc.Coach;

public class BaseballCoach implements Coach {

    //define a private field for the dependency
    //Constructor injection
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball coach is doing a workout";
    }

    @Override
    public String getDailyFortune() {

        //use the fortune service to get a fortune
        return fortuneService.getFortune();
    }
}
