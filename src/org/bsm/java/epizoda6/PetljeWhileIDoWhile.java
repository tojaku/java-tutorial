package org.bsm.java.epizoda6;

import java.util.Scanner;

public class PetljeWhileIDoWhile {

    public static void main(String[] args) {
        PetljeWhileIDoWhile objekt = new PetljeWhileIDoWhile();

        objekt.unosISumaBrojeva();

        //objekt.beskonacnaPetlja();
    }

    public int unosISumaBrojeva() {
        Scanner s = new Scanner(System.in);

        int suma = 0;
        int brojac = 0;

        System.out.println("Unosite cijele pozitivne brojeve."
                + " Unos potvrdite tipkom Enter."
                + " Za kraj unesite -1.");

        int broj = s.nextInt(); // učitavamo prvi broj
        while (broj != -1) {    // provjeravamo je li novi broj različit od -1
            brojac++;           // uvećavamo brojač brojeva za 1
            suma += broj;       // uvećavamo sumu za novi broj
            broj = s.nextInt(); // učitavamo novi broj
        }

        System.out.println("Suma " + brojac + " unesenih brojeva je: " + suma);
        return suma;
    }

    public void beskonacnaPetlja() {
        boolean broji = true;
        int brojac = 1;
        do {
            System.out.println("Brojim = " + brojac++);

            /*if (brojac == 100000) {
                broji = false;
            }*/
        } while (broji);
    }

}
