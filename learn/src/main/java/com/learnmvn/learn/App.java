package com.learnmvn.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // problem, it's close coupling, not loose coupling when you called new
//        Car obj = new Car();
        // to use the Spring Framework we do
        // reading bean from xml file.
        //but it has 3 ways
        /*
         * to configure 
         * we could use 
         * 1 xml
         * 2 annotation
         * 3 java configuration
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive();
    }
}
