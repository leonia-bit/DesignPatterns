package com.bottomline;

public class User {
    // Fields (attributes)
    public String name;
    public int age;
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Methods
    public String getUserName(){
        return name;
    }
    public void sayHello(){
        System.out.println("Hi, my name is  " + name);
    }
}
