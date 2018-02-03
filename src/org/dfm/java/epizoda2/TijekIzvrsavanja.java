package org.dfm.java.epizoda2;

public class TijekIzvrsavanja {

    public static void main(String[] args) {
        // Jednolinijski komentar
        System.out.println("Linija 1");
        System.out.println("Linija 2");
        System.out.println("Linija 3");
        System.out.println("Linija 4");
        System.out.println("Linija 5");
        {
            /* Višelinijski komentar
            Proteže se kroz više linija i
            obavezno ima znak za završetak komentara
             */
            System.out.println("Linija 6");
            System.out.println("Linija 7");
            {
                System.out.println("Linija 8");
                System.out.println("Linija 9");
                System.out.println("Linija 10");
            }
        }

        // Testiranje klase Zarulja
        Zarulja prva = new Zarulja();
        prva.tehnologija = "led";
        prva.snagaUWatima = 10;
        prva.vrstaSvjetlosti = "topla";
        prva.tipGrla = "e27";

        prva.upali();
        prva.promijeniIntenzitet(-50);
        prva.provjeriIntenzitet();

        Zarulja druga = new Zarulja();
        druga.tehnologija = "žarna nit";
        druga.snagaUWatima = 100;
        druga.vrstaSvjetlosti = "hladna";
        druga.tipGrla = "e14";

        druga.upali();
        druga.provjeriIntenzitet();
        druga.ugasi();
        druga.provjeriIntenzitet();
    }

}
