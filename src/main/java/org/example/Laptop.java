package org.example;

public class Laptop implements Computer{
    public Laptop(){
        System.out.println("Laptop Object Creation");
    }

    @Override
    public void compile(){
        System.out.println("compiling using Laptop");
    }
}
