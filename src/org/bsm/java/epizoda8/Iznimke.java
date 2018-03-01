package org.bsm.java.epizoda8;

public class Iznimke {

    public static void main(String[] args) {
        Iznimke objekt = new Iznimke();

        //objekt.jednostavnoHvatanje();
        //objekt.opcenitoHvatanje();
        //objekt.konkretnoHvatanje();
    }

    public void jednostavnoHvatanje() {
        int polje[] = new int[3];

        polje[0] = 1;
        polje[1] = 2;
        polje[2] = 3;

        // bez detekcije i obrade iznimke
        //polje[5] = 6;
        try {
            polje[5] = 6;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Ne postoji indeks 5 u polju!");
            System.out.println("Detaljan uzrok iznimke: " + ex.toString());
        }

        System.out.println("I dalje možemo po starom...");
    }

    public void opcenitoHvatanje() {
        String polje[] = {"a", "b", null};

        try {
            boolean test = polje[2].equals("a");    // NullPointerException
            //polje[3] = "c";                         // ArrayIndexOutOfBoundsException
        } catch (Exception ex) {
            System.out.println("Dogodila se neka greška!");
            System.out.println("Detaljan uzrok iznimke: " + ex.toString());
        }
    }

    public void konkretnoHvatanje() {
        String polje[] = {"a", "b", null};

        try {
            //boolean test = polje[2].equals("a");    // NullPointerException
            polje[3] = "c";                         // ArrayIndexOutOfBoundsException
        } catch (NullPointerException ex) {
            System.out.println("Pokušavaš raditi s nepostojećim objektom!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Pokušavaš dohvatiti element polja koji ne postoji!");
        } finally {
            System.out.println("Ako treba još nešto napraviti, možemo ovdje!");
        }
    }
}
