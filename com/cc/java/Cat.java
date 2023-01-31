package com.cc.java;

public class Cat {
   
    public String name;
    public String furColor;
    public int age;
    
    // public void tellYourAddress()
    public String tellYourAddress()
    {
        // this --> Instanzvariable
        // System.out.println("Blick von innen: " + this);
        return "Blick von innen: " + this;
    }

}
