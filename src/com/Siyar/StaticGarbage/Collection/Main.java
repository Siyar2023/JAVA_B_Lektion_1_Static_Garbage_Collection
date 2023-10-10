package com.Siyar.StaticGarbage.Collection;

public class Main {
    public static void main(String[] args) {


        Counter counterA = new Counter(); //instansiera
        Counter counterB = new Counter();

        for (int i= 0; i < 5; i++){
            System.out.println("---Counter A---");
            counterA.count();
            System.out.println("---Counter B---");
            counterB.count();

        }


        //Kalla på objekt
        //counter.count();
        //counter.count();
    }
}
