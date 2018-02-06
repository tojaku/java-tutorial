package org.dfm.java.epizoda3;

public class Varijable {

    public static void main(String[] args) {
        int broj; // deklaracija cjelobrojne varijable broj
        
        // sljedeća naredba neće raditi jer smo zaboravili inicijalizirati varijablu
        // System.out.println("Vrijednost varijable broj je " + broj);
        
        broj = 1;
        System.out.println("Vrijednost varijable broj je " + broj);
        
        String rijec = "Jabuka";
        System.out.println("Vrijednost varijable rijec je " + rijec);
        
        rijec = "Kruška";
        System.out.println("Vrijednost varijable rijec je " + rijec);
        
        /* sljedeće linije neće raditi jer pokušavamo varijabli 
        dodijeliti neodgovarajuću vrijednost */
        // broj = "Šljiva";
        // rijec = 10;
        
        /* sljedeća linija rakođer neće raditi, varijable se ne mogu ponovno
        deklarirati */
        // int broj = 100;
        
        double realan1, realan2, realan3 = 3.5, realan4;
        System.out.println("Vrijednost varijable realan3 je " + realan3);
        
        // sljedeći nazivi za varijable nisu prihvatljivi 
        /*
        int 543broj;
        int moj broj;
        int for;
        int broj-1;
        int brojk@;
        */
        
        // sljedeći nazivi za varijable su ok
        int broj_dana_u_godini;
        int brojDanaUMjesecu;
        int broj5;
        int brakeFree;
    }
    
}
