package com.Siyar.StaticGarbage.Collection;

public class Main {
    public static void main(String[] args) {

        Counter counter  = new Counter();
        Counter counterA = new Counter(); //instansiera
        Counter counterB = new Counter();
        Counter counterC = new Counter();
        Counter counterD = new Counter();

        for (int i= 0; i < 5; i++){
            System.out.println("---Counter A---");
            counterA.count();
            System.out.println("---Counter B---");
            counterB.count();


            //Garbage Collection
            new Counter(); //Anonymouse Objekt
            counter = null; // Nulling reference
            counterC = counterD; //reference to another counter
        }


        //Kalla på objekt
        //counter.count();
        //counter.count();
    }
}
