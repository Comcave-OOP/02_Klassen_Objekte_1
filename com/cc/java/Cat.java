package com.cc.java;

public class Cat {
    // // Ohne Konstruktor (Zugriff auch von außen)
    // public String name;
    // public String furColor;
    // public int age;

    // Mit Konstruktor (Zugriff nur von innen)
    private String name;
    private String furColor;
    private int age;
 
    // Konstruktor
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String tellYourName()
    {
       return this.name; 
    }

    public String tellYourFurColor()
    {
       return this.furColor; 
    }

    public int tellYourAge()
    {
       return this.age; 
    }

    // public void tellYourAddress()
    public String tellYourAddress()
    {
        // this --> Instanzvariable
        // System.out.println("Blick von innen: " + this);
        return "Blick von innen: " + this;
    }

}
