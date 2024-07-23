package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    //int age; using private for setters and getters
    @Value("21") // Injecting the value 21
    private int age;
    private Computer com;

    public Alien(){
        System.out.println("Alien Object Creating");
    }

    /*@ConstructorProperties({"age","lap"})
    public Alien(int age , Computer com) {
        System.out.println("Parametrised Constructor");
        this.age = age;
        this.com = com;
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       // System.out.println("setter called");
        this.age = age;
    }
    /* SetAge is a setter Injection.We are setting the value age.
    */

   /* public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        System.out.println("Latpot Setter");
        this.lap = lap;
    }*/

    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
