package org.bsm.java.epizoda5;

public class LogickiIzrazi {

    public static void main(String[] args) {
        
        int matematika = 2 + 8 / 2 * 2 % 3 + 1;
        System.out.println("matematika: " + matematika);
        
        boolean logika1 = matematika == 5;
        boolean logika2 = 3 * 2 % 2 + 3 == 0; // lijevi dio izraza = 3
        System.out.println("logika1: " + logika1);
        System.out.println("logika2: " + logika2);
        
        boolean logika3 = matematika >= 2;
        boolean logika4 = 5 + 3 % 2 - 6 < 10; // lijevi dio izraza = 0
        System.out.println("logika3: " + logika3);
        System.out.println("logika4: " + logika4);
        
    }
    
}
