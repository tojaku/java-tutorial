package org.dfm.java.epizoda4;

public class ZnakovniNizovi {

    public static void main(String[] args) {
        ZnakovniNizovi objekt = new ZnakovniNizovi();

        objekt.duzinaZnakovnogNiza("Epizoda 4");

        objekt.traziUNizu("Riba ribi grize rep", "rep");
        objekt.traziUNizu("Riba ribi grize rep", "r", 10);

        objekt.traziUNizu("Utorak", 5);

        objekt.izrezi("Osnove Java jezika", 7, 11);

        objekt.zamijeni("Obožavam ponedjeljak!", "ponedjeljak", "subotu");

        objekt.spoji("Dobar", " dan");

        objekt.usporedi("ana", "ana");
        objekt.usporedi("ana", "ivo");
        objekt.usporedi("ivo", "ana");
        // rezultat je 0 ako su nizovi jednaki
        // rezultat je manji od nule ako je prvi niz abecedno ispred drugog
        // rezultat je veći od nule ako je drugi string abecedno ispred prvog
    }

    public int duzinaZnakovnogNiza(String niz) {
        int duzina = niz.length();
        System.out.println("Dužina poslanog niza jest " + duzina);
        return duzina;
    }

    public int traziUNizu(String niz, String trazeno) {
        int indeks = niz.indexOf(trazeno);
        System.out.println("Traženo se nalazi na indeksu " + indeks);
        return indeks;
    }

    public int traziUNizu(String niz, String trazeno, int poslijeIndeksa) {
        int indeks = niz.indexOf(trazeno, poslijeIndeksa);
        System.out.println("Traženo se nalazi na adresi " + indeks);
        return indeks;
    }

    public char traziUNizu(String niz, int indeks) {
        char znak = niz.charAt(indeks);
        System.out.println("Na zadanom indeksu nalazi se znak " + znak);
        return znak;
    }

    public String izrezi(String niz, int pocetniIndeks, int zavrsniIndeks) {
        String izrezano = niz.substring(pocetniIndeks, zavrsniIndeks);
        System.out.println("Izrezani niz glasi " + izrezano);
        return izrezano;
    }

    public String zamijeni(String niz, String trazi, String zamijeni) {
        String rezultat = niz.replace(trazi, zamijeni);
        /* postoji i verzija metode replaceFirst koja bi zamijenila samo
        prvu pojavu trazenog izraza u nizu */
        System.out.println("Rezultat zamjene glasi " + rezultat);
        return rezultat;
    }

    public String spoji(String prvi, String drugi) {
        String rezultat = prvi.concat(drugi);
        System.out.println("Spojeni string glasi " + rezultat);
        return rezultat;
    }

    public int usporedi(String prvi, String drugi) {
        int rezultat = prvi.compareTo(drugi);
        System.out.println("Rezultat usporedbe " + rezultat);
        return rezultat;
    }
}
