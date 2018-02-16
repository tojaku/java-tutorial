package org.bsm.java.epizoda2;

public class Zarulja {

    // javni podatkovni članovi, vidljvi vanjskom svijetu i mogu se mijenjati
    public String tehnologija;
    public int snagaUWatima;
    public String tipGrla;
    public String vrstaSvjetlosti;

    /* privatni podatkovni članovi, nevidljivi vanjskom svijeti i mogu se 
    mijenjati samo funkcijskim članovima u istoj klasi */
    private boolean ukljucena = false;
    private float intenzitet = 0;

    // javni funkcijski članovi (metode), dostupni vanjskom svijetu
    public void upali() {
        this.ukljucena = true;
        this.intenzitet = 1;
    }

    public void ugasi() {
        this.ukljucena = false;
        this.intenzitet = 0;
    }

    public void promijeniIntenzitet(int postotak) {
        this.intenzitet = this.intenzitet + (this.intenzitet * ((float) postotak / 100));
    }

    public boolean provjeriUkljucenost() {
        return this.ukljucena;
    }

    public float provjeriIntenzitet() {
        System.out.println("Trenutni intenzitet žarulje ["
                + this.tehnologija + "/"
                + this.snagaUWatima + "W/"
                + this.vrstaSvjetlosti + "/"
                + this.tipGrla
                + "]" + ": " + this.intenzitet);
        return this.intenzitet;
    }

}
