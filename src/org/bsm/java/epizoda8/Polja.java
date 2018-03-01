package org.bsm.java.epizoda8;

import java.util.Random;

public class Polja {

    public static void main(String[] args) {

        // deklaracija i inicijalizacija polja
        int temperature[] = new int[20];

        // popunjavanje polja slučajnim vrijednostima
        Random generator = new Random();
        for (int i = 0; i < temperature.length; i++) {
            int slucajanBroj = generator.nextInt(56) - 15; // -15 do 40
            temperature[i] = slucajanBroj;
            System.out.println("U polje dodana temperatura: " + slucajanBroj);
        }

        // izračun prosječne temperature
        int zbrojTemperatura = 0;
        for (int temperatura : temperature) {
            zbrojTemperatura += temperatura;
        }

        double prosjek = (double) zbrojTemperatura / temperature.length;
        System.out.println("Prosjek iznosi: " + prosjek);

        // dohvat nepostojećeg elementa
        // System.out.println("Temperature na indeksu 50: " + temperature[50]);

    }

}
