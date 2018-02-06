package org.dfm.java.epizoda3;

public class ZnakovniNizovi {

    public static void main(String[] args) {

        char znakOk = 'A';
        // neispravno koristenja tipa char
        /*
        char znakGreska1 = "A";
        char znakGreska2 = 'Jabuka';
         */

        String znakovniNizOk = "Pozdrav Java programerima";
        // neispravno koristenja tipa String
        /*
        String znakovniNizGreska1 = 'Jesam li znak ili niz?';
         */

        String java = "Java";
        String spojeniNiz = "Ovo je " + 3 + " epizoda"
                + " iz serijala " + "Osnove " + java + " jezika";
        System.out.println(spojeniNiz);

        System.out.println("\tTabulator");
        System.out.println("Pomak\bu lijevo iliti backspace");
        System.out.println("Novi\nred");
        System.out.println("Početak\rlinije");
        
        // sljedeća linija neće raditi
        // System.out.println("Navodnici "unutar" navodnika");
        System.out.println("Navodnici \"unutar\" navodnika");
        
        // vrijedi i za jednostruke navodnike
        System.out.println('\'');

        // sljedeća linija neće raditi
        // System.out.println("Kosa \ crta");
        System.out.println("Kosa \\ crta");

        // pisanje u više linija
        System.out.println("(1) Riba "
                + "ribi "
                + "grize "
                + "rep ");

        System.out.println("(2) Riba\n"
                + "ribi\n"
                + "grize\n"
                + "rep\n");

    }

}
