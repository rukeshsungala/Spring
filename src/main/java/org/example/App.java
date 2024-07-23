package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Java Based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();

//        Desktop dt = context.getBean("desktop1",Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean("desktop1",Desktop.class);
//        dt1.compile();

        /* This is normal object
        Alien obj = new Alien();
        obj.code();
         */
        /* This is xml based configuration:-
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // it will create objects in container
        Alien obj = (Alien) context.getBean("alien");

       // obj.setAge(21); // Here Age is set as 21
        System.out.println(obj.getAge());
        obj.code();
        */
        /* Alien obj1 = (Alien) context.getBean("alien");
        System.out.println(obj1.age);
        //obj1.code();
        //For above two objects are same when the scope is singleton

         */
    }
}
