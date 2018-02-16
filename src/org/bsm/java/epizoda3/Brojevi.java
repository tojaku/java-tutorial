package org.bsm.java.epizoda3;

public class Brojevi {

    public static void main(String[] args) {
        byte a = 120;
        short b = 2000;
        int c = 50000;

        /* sljedeća linija neće raditi, budući da kompajler smatra da su svi
        cijeli brojevi tipa int, moramo eksplicitno navesti da se radi o long */
        // long d = 7000000000;
        long d = 7000000000L;

        /* sljedeća linija neće raditi, budući da kompajler smatra da su svi
        realni brojevi tipa double, moramo također eksplicitno navesti da se
        radi o float */
        // float e = 17.55;
        float e = 17.55F;

        double f = 3.5E50;

        final double PI = 3.141592;

        /* sljedeća linija neće raditi, konstanta se ne može naknadno mijenjati */
        // PI = 3.14;
        
        int zbroj = a + b;
        System.out.println("(1) Zbroj je " + zbroj);

        zbroj = zbroj + c;
        System.out.println("(2) Zbroj je " + zbroj);
        zbroj += c; // skraćeni oblik prethodne naredbe
        System.out.println("(3) Zbroj je " + zbroj);

        int razlika = a - b;
        System.out.println("(1) Razlika je " + razlika);

        razlika = razlika - c;
        System.out.println("(2) Razlika je " + razlika);
        razlika -= c; // skraćeni oblik prethodne naredbe
        System.out.println("(3) Razlika je " + razlika);

        int umnozak = a * b;
        System.out.println("(1) Umnožak je " + umnozak);

        umnozak = umnozak * c;
        System.out.println("(2) Umnožak je " + umnozak);
        umnozak *= c; // skraćeni oblik prethodne naredbe
        System.out.println("(3) Umnožak je " + umnozak);

        double kolicnik = (double) a / b;
        System.out.println("(1) Količnik je " + kolicnik);

        kolicnik = kolicnik / c;
        System.out.println("(2) Količnik je " + kolicnik);
        kolicnik /= c; // skraćeni oblik prethodne naredbe
        System.out.println("(3) Količnik je " + kolicnik);

        // modulo je operator koji daje ostatak cjelobrojnog dijeljenja
        int ostatak = 20 % 3;
        System.out.println("(1) Ostatak dijeljenja je " + ostatak);
        ostatak = ostatak % 3;
        System.out.println("(2) Ostatak dijeljenja je " + ostatak);
        ostatak %= 3; // skraćeni oblik prethodne naredbe
        System.out.println("(3) Ostatak dijeljenja je " + ostatak);

        // inkrement je uvećanje, a dekrement umanjenje broja za jedan
        int inkrement = 2;
        inkrement++; // ekvivalentno naredbi: inkrement = inkrement + 1 ili inkrement += 1
        int dekrement = 3;
        dekrement--; // ekvivalentno naredbi: dekrement = dekrement 1 1 ili dekrement -= 1
        System.out.println("inkrement = " + inkrement + ", dekrement = " + dekrement);

        // postoje 2 oblika ovih naredbi, prefiksni i postfiksni oblik
        int g = 5;
        int h = g++;
        System.out.println("g = " + g + ", h = " + h);
        int i = ++g;
        System.out.println("g = " + g + ", i = " + i);
        int j = g--;
        System.out.println("g = " + g + ", j = " + j);
        int k = --g;
        System.out.println("g = " + g + ", k = " + k);

        // muke po dijeljenju
        int dijeljenje1 = 10 / 3;
        double dijeljenje2 = 10 / 3;
        System.out.println("dijeljenje1 = " + dijeljenje1
                + ", dijeljenje2 = " + dijeljenje2);
        double dijeljenje3 = 10 / 3.0; // ili: dijeljenje3 = 10 / 3D;
        System.out.println("dijeljenje3 = " + dijeljenje3);
        double dijeljenje4 = 10 / (double) 3;
        System.out.println("dijeljenje4 = " + dijeljenje4);
        
        // redoslijed izvršavanja operacija
        int redoslijed = 25 - 5 * 6 / 2 - 10 + 4;
        System.out.println("redoslijed = " + redoslijed);
        
        // parsiranje
        String intKaoString = "150";
        String doubleKaoString = "7.5";
        
        System.out.println("čudan zbroj = " + intKaoString + doubleKaoString);
        
        int intKaoInt = Integer.parseInt(intKaoString);
        double doubleKaoDouble = Double.parseDouble(doubleKaoString);
        
        double rezultat = doubleKaoDouble * intKaoInt;
        System.out.println("rezultat = " + rezultat);
        
        // sljedeća linija neće raditi, bacit će pogrešku prilikom izvršavanja
        // int nemaSmisla = Integer.parseInt("Lopta");
    }

}
