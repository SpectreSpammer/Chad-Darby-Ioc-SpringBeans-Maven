package com.chad.darby.BeanLifeCycle;

import com.chad.darby.ioc.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());


        //close context
        context.close();
    }
}
