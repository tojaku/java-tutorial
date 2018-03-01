package org.bsm.java.epizoda8;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class ArrayLista {

    public static void main(String[] args) {
        ArrayLista objekt = new ArrayLista();

        objekt.mjeseci();

        objekt.temperature();
    }

    public void mjeseci() {
        ArrayList<String> mjeseci = new ArrayList<>();

        // dodavanje u listu
        System.out.println("DODAVANJE U LISTU");
        mjeseci.add("Siječanj");
        mjeseci.add("Veljača");
        mjeseci.add("Ožujak");
        mjeseci.add("Travanj");
        mjeseci.add("Svibanj");
        mjeseci.add("Lipanj");
        mjeseci.add("Srpanj");
        mjeseci.add("Srpanj");
        mjeseci.add("Kolovoz");
        mjeseci.add("Rujan");
        mjeseci.add("Listopa");
        mjeseci.add("Studeni");
        mjeseci.add("Prosinac");

        System.out.println("Veličina liste je: " + mjeseci.size());
        System.out.println("Stanje liste: " + mjeseci.toString());

        // uklanjanje duplikata
        System.out.println("UKLANJANJE DUPLIKATA");
        int duplikat = mjeseci.indexOf("Srpanj");
        mjeseci.remove(duplikat);
        // stanje liste pomoću for
        System.out.println("Stanje liste:");
        for (int i = 0; i < mjeseci.size(); i++) {
            String element = mjeseci.get(i);
            System.out.println("* " + element);
        }

        // uklanjanje greške
        System.out.println("UKLANJANJE GREŠKE");
        int greska = mjeseci.indexOf("Listopa");
        mjeseci.set(greska, "Listopad");

        // stanje liste pomoću for-each
        System.out.println("Stanje liste:");
        for (String element : mjeseci) {
            System.out.println("-> " + element);
        }
    }

    public void temperature() {
        ArrayList<Integer> temperature = new ArrayList<>();

        // dodavanje slučajnih brojeva u listu
        System.out.println("DODAVANJE U LISTU");
        Random generator = new Random();
        for (int i = 0; i < 20; i++) {
            int slucajanBroj = generator.nextInt(56) - 15;      // -15 do 40
            temperature.add(slucajanBroj);                      // autoboxing, int -> Integer
            System.out.println("U listu dodana temperatura: " + slucajanBroj);
        }

        System.out.println("Veličina liste je: " + temperature.size());
        System.out.println("Stanje liste: " + temperature.toString());

        // brisanje svih elemenata većih od 25, kretanje unaprijed
        System.out.println("MANIPULACIJA");
        ListIterator<Integer> listIterator = temperature.listIterator();
        while (listIterator.hasNext()) {
            int vrijednost = listIterator.next();               // unboxing, Integer -> int
            if (vrijednost > 25) { // uklanjamo veće od 25
                listIterator.remove();
            }
            if (vrijednost < 0) { // mijenjamo negativne u 0
                listIterator.set(0);                            // autoboxing, int -> Integer
            }
        }

        System.out.println("Veličina liste je: " + temperature.size());
        System.out.println("Stanje liste: " + temperature.toString());

        // izračun prosjeka, kretanje unatrag, št je moguće jer smo prethodno otišli do kraja
        System.out.println("IZRAČUN PROSJEKA");
        int zbrojTemperatura = 0;
        while (listIterator.hasPrevious()) {
            int vrijednost = listIterator.previous();           // unboxing, Integer -> int
            zbrojTemperatura += vrijednost;
        }
        double prosjek = (double) zbrojTemperatura / temperature.size();
        System.out.println("Prosjek iznosi: " + prosjek);

        // čišćenje liste
        System.out.println("ČIŠĆENJE");
        temperature.clear();

        System.out.println("Veličina liste je: " + temperature.size());
        System.out.println("Stanje liste: " + temperature.toString());
    }

}
