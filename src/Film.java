public class Film {
    private String nazev;
    private int rokVydani;
    private int hodnoceni;
    private Herec[] poleHercu;

    public Herec[] getPoleHercu() {
        return poleHercu;
    }

    public String getNazev() {
        return nazev;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public int getHodnoceni() {
        return hodnoceni;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setRokVydani(int rokVydani) {
        this.rokVydani = rokVydani;
    }

    public void setHodnoceni(int hodnoceni) {
        this.hodnoceni = hodnoceni;
    }

    public void setPoleHercu(Herec[] poleHercu) {
        this.poleHercu = poleHercu;
    }


    public Film(String nazev, int rokVydani, int hodnoceni, Herec[] poleHercu) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.hodnoceni = hodnoceni;
    }
}
