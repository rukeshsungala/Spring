package org.example;

public class Alien {
    //int age; using private for setters and getters
    private int age;
    private Laptop lap;

    public Alien(){
        System.out.println("Alien Object Creating");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }
    /* SetAge is a setter Injection.We are setting the value age.
    */

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Coding");
        lap.compile();
    }
}
