package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        // // 1.Instanziierung class --> object / instance
        // // Cat --> Referenztyp
        // // cat --> Referenzvariable

        // Objekterzeugung ohne Konstruktor
        // Cat cat = new Cat();
        // cat.name = "Grizabella";
        // cat.furColor = "white";
        // cat.age = 29;

        // Objekterzeugung mit Konstruktor
        Cat cat = new Cat("Grizabelle", "white", 29);

        // Ausgabe
        // output(cat.name);
        // output(cat.furColor);
        // output(String.valueOf(cat.age)); // Typkonvertierung
        // output(cat.tellYourName());
        // output(cat.tellYourFurColor());
        // output(String.valueOf(cat.tellYourAge()));
        output(cat.getName());
        output(cat.getFurColor());
        output(String.valueOf(cat.getAge()));

        output("Blick von aussen: " + cat);
        // cat.tellYourAddress()
        output(cat.tellYourAddress());

        output("------------------------------------------");

        // Objekterzeugung ohne Konstruktor
        // Cat cat2 = new Cat();
        // cat2.name = "Alonzo";
        // cat2.furColor = "grey";
        // cat2.age = 35;

        // Objekterzeugung mit Konstruktor
        Cat cat2 = new Cat("Alonzo", "grey", 35);

        // Ausgabe
        // output(cat2.name);
        // output(cat2.furColor);
        // output(String.valueOf(cat2.age));
        // output(cat2.tellYourName());
        // output(cat2.tellYourFurColor());
        // output(String.valueOf(cat2.tellYourAge()));
        output(cat2.getName());
        output(cat2.getFurColor());
        output(String.valueOf(cat2.getAge()));

        output("Blick von aussen: " + cat2);
        // cat2.tellYourAddress()
        output(cat2.tellYourAddress());

        cat2.setFurColor("blue");
        output(cat2.getFurColor());
      
    }

  
    private static void output(String outputStr)
    {
        System.out.println(outputStr);
    }


}

