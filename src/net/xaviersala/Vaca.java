package net.xaviersala;

public class Vaca {

    private String nom;
    private int pes;
    private int litres;

    public Vaca(String nom, int pes, int litres) {
        super();
        this.nom = nom;
        this.pes = pes;
        this.litres = litres;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getPes() {
        return pes;
    }
    public void setPes(int pes) {
        this.pes = pes;
    }
    public int getLitres() {
        return litres;
    }
    public void setLitres(int litres) {
        this.litres = litres;
    }

    @Override
    public String toString() {
        return nom + "(" + litres + ")";
    }



}
