package org.bsm.java.epizoda5;

public class Grananje {

    public static void main(String[] args) {
        Grananje objekt = new Grananje();

        // zamisli broj - verzija 1
        objekt.zamisliJedanBrojVerzija1(2);
        objekt.zamisliJedanBrojVerzija1(-4);
        objekt.zamisliJedanBrojVerzija1(172);

        // zamisli broj - verzija 2
        objekt.zamisliJedanBrojVerzija2(5);
        objekt.zamisliJedanBrojVerzija2(-17);
        objekt.zamisliJedanBrojVerzija2(1024);

        // jednakost znakovnih nizova
        String a = "dobar";
        String b = " dan";
        String c = "dobar dan";
        String d = "Dobar dan";
        objekt.jednakostZnakovnihNizova(c, a + b);
        objekt.jednakostZnakovnihNizova(d, a + b);

        // indeks tjelesne mase
        objekt.indeksTjelesneMase(77, 1.83);

        // uvjetni operator
        objekt.prolazIliPad("Ana", 75);
        objekt.prolazIliPad("Pero", 49);
        
        // broj dana u mjesecu
        objekt.brojDanaUMjesecu(2);
        objekt.brojDanaUMjesecu(7);
        objekt.brojDanaUMjesecu(45);
    }

    public void zamisliJedanBrojVerzija1(int broj) {
        System.out.println("Pogađanje brojeva verzija 1");
        if (broj <= 0) {
            System.out.println("Samo pozitivni brojevi molim!");
        }
        if (broj == 1) {
            System.out.println("Vaš zamišljeni broj je " + 1);
        }
        if (broj == 2) {
            System.out.println("Vaš zamišljeni broj je " + 2);
        }
        if (broj == 3) {
            System.out.println("Vaš zamišljeni broj je " + 3);
        }
        if (broj == 4) {
            System.out.println("Vaš zamišljeni broj je " + 4);
        }
        if (broj == 5) {
            System.out.println("Vaš zamišljeni broj je " + 5);
        }
        if (broj > 5) {
            System.out.println("Hej! Polako s tim brojevima!");
        }
    }

    public void zamisliJedanBrojVerzija2(int broj) {
        System.out.println("Pogađanje brojeva verzija 2");
        if (broj <= 0) {
            System.out.println("Samo pozitivni brojevi molim!");
        } else if (broj == 1) {
            System.out.println("Vaš zamišljeni broj je " + 1);
        } else if (broj == 2) {
            System.out.println("Vaš zamišljeni broj je " + 2);
        } else if (broj == 3) {
            System.out.println("Vaš zamišljeni broj je " + 3);
        } else if (broj == 4) {
            System.out.println("Vaš zamišljeni broj je " + 4);
        } else if (broj == 5) {
            System.out.println("Vaš zamišljeni broj je " + 5);
        } else {
            System.out.println("Hej! Polako s tim brojevima!");
        }
    }

    public void jednakostZnakovnihNizova(String niz1, String niz2) {
        System.out.println("Utvrđujemo jednakost znakovnih nizova");
        System.out.println("Niz1: " + niz1);
        System.out.println("Niz2: " + niz2);

        boolean test1 = niz1 == niz2;

        boolean test2 = niz1.equals(niz2);

        boolean test3 = niz1.equalsIgnoreCase(niz2);

        System.out.println("test1 (==): " + test1);
        System.out.println("test2 (equals): " + test2);
        System.out.println("test3 (equalsIgnoreCase): " + test3);
    }

    public void indeksTjelesneMase(int masaUKg, double visinaUM) {
        double bmi = (double) masaUKg / Math.pow(visinaUM, 2);

        System.out.println("Vaš indeks tjelesne mase je " + bmi);

        if (bmi < 18.5) {
            System.out.println("Pothranjeni ste!");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Imate idealnu tjelesnu masu!");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Imate prekomjernu tjelesnu masu!");
        } else {
            System.out.println("Gojzni ste!");
        }
    }

    public void prolazIliPad(String ime, int postotak) {
        System.out.println(ime + ", vi ste " + ((postotak >= 50) ? "prošli" : "pali"));
    }

    public void brojDanaUMjesecu(int mjesec) {
        System.out.print(mjesec + ". mjesec ima ");

        switch (mjesec) {
            case 2:
                System.out.println("28 dana, a prijestupne godine 29 dana.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 dana.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                System.out.println("31 dan.");
                break;
            default:
                System.out.println("... ali ne postoji takav mjesec, dobar pokušaj!");
                break;
        }
    }
}
