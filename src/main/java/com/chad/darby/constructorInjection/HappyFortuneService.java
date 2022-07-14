package com.chad.darby.constructorInjection;

public class HappyFortuneService implements FortuneService {


    @Override
    public String getFortune() {
        return "HappyFortuneService - today is your lucky day";
    }
}
