package org.bsm.java.epizoda7;

public class TestKorisnika {

    public static void main(String[] args) {

        // stvaranje objekata i prikaz adrese u memoriji
        Korisnik pero = new Korisnik("pperic", "pperic@dmail.com", "123456");
        Profil perinProfil = new Profil("Pero", "Perić", 1990);
        pero.setProfil(perinProfil);

        Korisnik marko = new Korisnik("mmaric", "mmaric@dmail.com", "654321",
                new Profil("Marko", "Marić", 1988, "Zagreb"));

        System.out.println("Korisnik pero: " + pero);
        System.out.println("Korisnik marko: " + marko);

        // usporedba dvaju naočigled jednakih objekata
        Korisnik markoKlon = new Korisnik("mmaric", "mmaric@dmail.com", "654321",
                new Profil("Marko", "Marić", 1988, "Zagreb"));

        boolean test1 = (marko == markoKlon);
        boolean test2 = (marko.equals(markoKlon));

        System.out.println("test1: " + test1 + ", test2: " + test2);
        System.out.println("Korisnik marko: " + marko);
        System.out.println("Korisnik markoKlon: " + markoKlon);

        // pristup članovima nepostojećeg objekta
        Korisnik ana = new Korisnik("aanic", "aanic@dmail.com", "242424");

        System.out.println("Anin profil: " + ana.getProfil());
        // sljedeća naredba uzrokovat će grešku NullPointerException
        // System.out.println("Anin profil: " + ana.getProfil().getMjestoStanovanja());

        // korištenje statičnih članova
        pero.prijava("123456");
        marko.prijava("123456");
        marko.prijava("654321");
        ana.prijava("242424");
        System.out.println("Broj aktivnih korisnika: " + Korisnik.getBrojAktivnihKorisnika());

        marko.promjenaPodataka("marko");
        marko.odjava();
        System.out.println("Broj aktivnih korisnika: " + Korisnik.getBrojAktivnihKorisnika());
    }

}
