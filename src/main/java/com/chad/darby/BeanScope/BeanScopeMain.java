package com.chad.darby.BeanScope;

import com.chad.darby.ioc.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMain {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container -> singleton
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //check if they are the same
        boolean result = (coach == alphaCoach);

        //print result for the singleton
        System.out.println("Same object : " +result);
        System.out.println("Memory location  for the coach " + coach);
        System.out.println("Memory location  for the alphaCoach " + alphaCoach);

        //close context
        context.close();
    }
}
