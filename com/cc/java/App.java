package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        // 1.Instanziierung class --> object / instance
        // Cat --> Referenztyp
        // cat --> Referenzvariable
        Cat cat = new Cat();
        output("Blick von aussen: " + cat);
        // cat.tellYourAddress()
        output(cat.tellYourAddress());

        output("------------------------------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        // cat2.tellYourAddress()
        output(cat2.tellYourAddress());
      
    }

  
    public static void output(String outputStr)
    {
        System.out.println(outputStr);
    }


}

