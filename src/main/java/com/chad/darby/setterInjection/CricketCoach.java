package com.chad.darby.setterInjection;

import com.chad.darby.constructorInjection.FortuneService;
import com.chad.darby.ioc.Coach;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    //add new field for emailaddress and team
    private String emailAddress;
    private String team;



    public String getEmailAddress() {
        return emailAddress;
    }

    //setter injection for emailAddress
    public void setEmailAddress(String emailAddress) {
        System.out.println("Setter injection of setEmailAddress");
        this.emailAddress = emailAddress;
    }


    public String getTeam() {
        return team;
    }

    //setter injection for team
    public void setTeam(String team) {
        System.out.println("Setter injection of setTeam");
        this.team = team;
    }





    //create a no arg constructor

    public CricketCoach() {
        System.out.println("No arg constructor of CricketCoach");
    }

    //setter injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter injection of CricketCoach");
        this.fortuneService = fortuneService;

    }

    @Override
    public String getDailyWorkout() {
        return "CricketCoach daily workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
