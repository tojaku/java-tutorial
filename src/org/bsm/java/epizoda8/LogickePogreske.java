package org.bsm.java.epizoda8;

public class LogickePogreske {

    public static void main(String[] args) {
        // neke logičke pogreške:
        
        // 1. pravila prioriteta operatora
        int prioritet1 = 5 + 4 * 3 / 2;
        int prioritet2 = (5 + 4) * 3 / 2;
        int prioritet3 = (5 + 4) * (3 / 2);
        int prioritet4 = (5 + (4 * 3)) / 2;

        System.out.println("1) prioritet1: " + prioritet1);
        System.out.println("1) prioritet2: " + prioritet2);
        System.out.println("1) prioritet3: " + prioritet3);
        System.out.println("1) prioritet4: " + prioritet4);

        // 2. brojanje elemenata
        int polje[] = {1, 2, 3, 4, 5};
        System.out.println("2) prvi element: " + polje[1]);

        // 3. neoprezno miješanje tipova
        double broj = 10 / 7;
        System.out.println("3) broj: " + broj);

        // 4. korištenje decimanih brojeva za testiranje jednakosti 
        broj = (double) 10 / 7;
        boolean test = broj == 1;
        System.out.println("4) test: " + test);

        // 5. točka zarez na pogrešnom mjestu
        for (int i = 0; i < 5; i++);
        {
            System.out.println("5) i = 1");
        }

        // 6. kombinacija spajanja znakovnih nizova i zbrajanja
        int a = 5;
        int b = 6;
        System.out.println("6) zbroj je " + a + b);
        System.out.println("6) točan zbroj je " + (a + b));
    }

}
