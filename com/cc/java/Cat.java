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

    // Eigene getter Funktionen
    // public String tellYourName()
    // {
    //    return this.name; 
    // }

    // public String tellYourFurColor()
    // {
    //    return this.furColor; 
    // }

    // public int tellYourAge()
    // {
    //    return this.age; 
    // }

    // Automatisch erzeugte getter und setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        boolean permission = false;
        if (permission) {
            this.furColor = furColor; 
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // public void tellYourAddress()
    public String tellYourAddress()
    {
        // this --> Instanzvariable
        // System.out.println("Blick von innen: " + this);
        return "Blick von innen: " + this;
    }

}
