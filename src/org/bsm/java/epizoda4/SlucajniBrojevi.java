package org.bsm.java.epizoda4;

import java.util.Random;

public class SlucajniBrojevi {

    public static void main(String[] args) {

        // deklaracija i inicijalizacija objekta klase Random
        Random generator = new Random();

        SlucajniBrojevi objekt = new SlucajniBrojevi();

        objekt.generirajTriCijelaBroja(generator);

        objekt.generirajOstaleTipove(generator);

        objekt.loto6od45(generator);

        objekt.generirajTriBrojaUzSeed(generator, 543672534L);
        objekt.generirajTriBrojaUzSeed(generator, 123672514L);
    }

    public void generirajTriCijelaBroja(Random r) {
        System.out.println("Prvi broj: " + r.nextInt());
        System.out.println("Drugi broj: " + r.nextInt());
        System.out.println("Treći broj: " + r.nextInt());
    }

    public void generirajOstaleTipove(Random r) {
        System.out.println("Istina ili laž: " + r.nextBoolean());
        System.out.println("Veliki cijeli broj: " + r.nextLong());
        System.out.println("Manje precizan realan broj: " + r.nextFloat());
        System.out.println("Precizniji realan broj: " + r.nextDouble());
    }

    public void loto6od45(Random r) {
        System.out.println("Loto 1: " + (r.nextInt(45) + 1));
        System.out.println("Loto 2: " + (r.nextInt(45) + 1));
        System.out.println("Loto 3: " + (r.nextInt(45) + 1));
        System.out.println("Loto 4: " + (r.nextInt(45) + 1));
        System.out.println("Loto 5: " + (r.nextInt(45) + 1));
        System.out.println("Loto 6: " + (r.nextInt(45) + 1));
    }

    public void generirajTriBrojaUzSeed(Random r, long seed) {
        r.setSeed(seed);
        this.generirajTriCijelaBroja(r);
    }
}
