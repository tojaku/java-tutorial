package org.bsm.java.epizoda7;

public class Profil {

    // privatni podatkovni članovi
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private String mjestoStanovanja;

    // konstruktor
    public Profil(String ime, String prezime) {
        /* argumenti imaju isti naziv kao i podatkovni članovi
           zbog toga pristupamo podatkovnim članovima pomoću naredbe this */
        this.ime = ime;
        this.prezime = prezime;
    }

    // preopterećeni konstruktor
    public Profil(String ime, String prezime, int godinaRodjenja) {
        this(ime, prezime);     // poziv postojećeg konstruktora
        this.godinaRodjenja = godinaRodjenja;
    }

    // preopterećeni konstruktor
    public Profil(String ime, String prezime, int godinaRodjenja, String mjestoStanovanja) {
        this(ime, prezime, godinaRodjenja);     // poziv postojećeg konstruktora
        this.mjestoStanovanja = mjestoStanovanja;
    }

    // metode za čitanje privatnih podatkovnih članova, tzv. getter metode
    public String getIme() {
        /* podatkovnom članu pristupamo bez naredbe this jer u metodi
           ne postoji istoimena varijabla, pa nema konflikta */
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public String getMjestoStanovanja() {
        return mjestoStanovanja;
    }

}
