package org.bsm.java.epizoda7;

public class Korisnik {

    // statični privatni podatkovni član
    private static int brojAktivnihKorisnika = 0;

    // privatni podatkovni članovi
    private String korisnickoIme;
    private String eMailAdresa;
    private String lozinka;
    private boolean prijavljen = false;

    // javni podatkovni član
    public Profil profil;

    // konstruktor
    public Korisnik(String korisnickoIme, String eMailAdresa, String lozinka) {
        this.korisnickoIme = korisnickoIme;
        this.eMailAdresa = eMailAdresa;
        this.lozinka = lozinka;
    }

    // preopterećeni konstruktor
    public Korisnik(String korisnickoIme, String eMailAdresa, String lozinka, Profil profil) {
        this(korisnickoIme, eMailAdresa, lozinka);  // poziv postojećeg konstruktora
        this.profil = profil;
    }

    // metode za čitanje i pisanje podatkovnih članova, tzv. getter i setter metode
    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public String getEMailAdresa() {
        return eMailAdresa;
    }

    public String getLozinka() {
        return lozinka;
    }

    public boolean isPrijavljen() {
        return prijavljen;
    }

    public Profil getProfil() {
        return profil;
    }

    // metoda za postavljanje podatkovnog člana, tzv. setter metoda
    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    // statična metode
    public static int getBrojAktivnihKorisnika() {
        // vraća statični podatkovni član
        return brojAktivnihKorisnika;
    }

    // opis ponašanja klase Korisnik metodama
    public boolean prijava(String lozinka) {
        if (lozinka.equals(this.lozinka)) {
            brojAktivnihKorisnika++;    // poziv statičnog člana
            // ili
            // Korisnik.brojAktivnihKorisnika++;
            prijavljen = true;

            System.out.println("Korisnik " + korisnickoIme + " uspješno prijavljen!");
            return true;
        } else {
            System.out.println("Pogrešno upisana lozinka!");

            return false;
        }
    }

    public boolean odjava() {
        if (prijavljen) {
            brojAktivnihKorisnika--;    // poziv statičnog člana
            prijavljen = false;

            System.out.println("Korisnik " + korisnickoIme + " uspješno odjavljen!");
            return true;
        } else {
            System.out.println("Korisnik nije prijavljen!");

            return false;
        }
    }

    public boolean promjenaLozinke(String stara, String nova) {
        if (prijavljen && stara.equals(lozinka)) {
            lozinka = nova;

            System.out.println("Lozinka korisnika " + korisnickoIme + " promijenjena!");
            return true;
        } else {
            System.out.println("Korisnik nije prijavljen ili lozinka nije točna!");
            return false;
        }
    }

    public boolean promjenaPodataka(String korisnickoIme) {
        if (prijavljen) {
            this.korisnickoIme = korisnickoIme;

            System.out.println("Podatci korisnika " + korisnickoIme + " uspješno promijenjeni!");
            return true;
        } else {
            System.out.println("Korisnik nije prijavljen!");

            return false;
        }
    }

    // preopterećenje neće raditi, potpis metode se nije promijenio
    /*
    public boolean promjenaPodataka(String eMailAdresa) {
        if (prijavljen) {
            this.eMailAdresa = eMailAdresa;

            System.out.println("Podatci korisnika " + korisnickoIme + " uspješno promijenjeni!");
            return true;
        } else {
            System.out.println("Korisnik nije prijavljen!");

            return false;
        }
    }
     */
    // preopterećenje ok, potpis metode se promijenio
    public boolean promjenaPodataka(String korisnickoIme, String eMailAdresa) {
        if (prijavljen) {
            this.korisnickoIme = korisnickoIme;
            this.eMailAdresa = eMailAdresa;

            System.out.println("Podatci korisnika " + korisnickoIme + " uspješno promijenjeni!");
            return true;
        } else {
            System.out.println("Korisnik nije prijavljen!");

            return false;
        }
    }
}
