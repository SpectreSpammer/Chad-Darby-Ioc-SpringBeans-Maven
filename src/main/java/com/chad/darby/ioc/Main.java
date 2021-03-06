package com.chad.darby.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        //call methods
        System.out.println(coach.getDailyWorkout());

        //calling the new method for fortunes
        System.out.println(coach.getDailyFortune());

        //close context
        context.close();
    }
}
