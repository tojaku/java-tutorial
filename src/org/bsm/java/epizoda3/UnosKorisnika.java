package org.bsm.java.epizoda3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class UnosKorisnika {

    public static void main(String[] args) {
        String ime = JOptionPane.showInputDialog("Unesite svoje ime");
        System.out.println("Unijeli ste ime " + ime);

        String starost = JOptionPane.showInputDialog("Unesite koliko ste stari");
        int starostInt = Integer.parseInt(starost);
        System.out.println("Za 10 godina imat ćete "
                + (starostInt + 10) + " godina");

        // složena upotreba objekta JOptionPane - izbornik
        String omiljenoVoce = (String) JOptionPane.showInputDialog(
                null,
                "Izaberite omiljeno voće",
                "Voće",
                2,
                null,
                new String[]{"Jabuka", "Kruška", "Šljiva", "Naranča"},
                "Jabuka");
        System.out.println("Vaše omiljeno voće je " + omiljenoVoce);

        // ispis poruke
        JOptionPane.showMessageDialog(null,
                "Hvala što ste bili toliko strpljivi",
                "Zahvala",
                1);

        Scanner sc = new Scanner(System.in);

        int cijeliBroj = sc.nextInt();
        double realanBroj = sc.nextDouble();
        String znakovniNiz = sc.next();

        sc.close();
        
        System.out.println("cijeliBroj = " + cijeliBroj + 
                "\nrealanBroj = " + realanBroj +
                "\nznakovniNiz = " + znakovniNiz);
    }

}
