package org.bsm.java.epizoda6;

public class PetljaFor {

    public static void main(String[] args) {
        PetljaFor objekt = new PetljaFor();

        objekt.potencijaBroja2(10);
        objekt.potencijaBroja2(50);

        objekt.ispisMatrice(4, 4);

        objekt.ispisJedinicneMatrice(5);

        objekt.ispisParnihINeparnihBrojeva(50);
    }

    public int potencijaBroja2(int potencija) {
        int rezultat = 1;
        for (int i = 1; i <= potencija; i++) {
            if (i > 30) {
                System.out.println("Prekidam izračun, maksimalna potencija je 30!");
                potencija = 30;
                break;
            }

            rezultat *= 2;
            System.out.println(i + ". međusuma: " + rezultat);
        }

        System.out.println(2 + " na potenciju " + potencija + " je " + rezultat);
        return rezultat;
    }

    public void ispisMatrice(int redaka, int stupaca) {
        System.out.println("Matrica izgleda ovako:");

        for (int i = 1; i <= redaka; i++) {
            for (int j = 1; j <= stupaca; j++) {
                System.out.print("[" + i + "," + j + "] "); // naredba x
            }
            System.out.print("\n");                         // naredba y
        }
    }

    public void ispisJedinicneMatrice(int red) {
        System.out.println("Jedinična matrica reda " + red + " izgleda ovako:");

        for (int i = 1; i <= red; i++) {
            for (int j = 1; j <= red; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
    }

    public void ispisParnihINeparnihBrojeva(int maksimum) {
        // ispis neparnih brojeva
        System.out.print("Neparni brojevi: ");
        for (int i = 1; i <= maksimum; i += 2) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        // ispis parnih brojeva
        System.out.print("Parni brojevi: ");
        for (int i = 0; i <= maksimum; i += 2) {
            if (i == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

}
