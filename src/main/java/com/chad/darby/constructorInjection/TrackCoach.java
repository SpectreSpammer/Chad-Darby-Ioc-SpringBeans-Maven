package com.chad.darby.constructorInjection;

import com.chad.darby.constructorInjection.HappyFortuneService;
import com.chad.darby.ioc.Coach;

public class TrackCoach implements Coach {

    //Constructor injection
    HappyFortuneService happyFortuneService;

    public TrackCoach(HappyFortuneService happyFortuneService) {
        this.happyFortuneService = happyFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Track coach daily workout";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it in trackcoach " + happyFortuneService.getFortune();
    }


    //Bean Life cycle
    //add an init method
    public  void startLifeCycle(){
        System.out.println("TrackCoach: inside method of startLifeCycle");
    }

    //add a destroy method
    public  void destroyLifeCycle(){
        System.out.println("TrackCoach: inside method of destroyLifeCycle");


    }
}
