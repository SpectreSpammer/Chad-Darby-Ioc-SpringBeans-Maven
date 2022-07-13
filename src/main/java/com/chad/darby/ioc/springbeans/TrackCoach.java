package com.chad.darby.ioc.springbeans;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Track coach";
    }
}
