package com.example.ppeandroidstudio.buyornot;

public class Additif {

    private int id_additif;
    private String libelle_additif;

    public Additif() {
    }

    public Additif(int id_additif, String libelle_additif) {
        this.id_additif = id_additif;
        this.libelle_additif = libelle_additif;
    }

    public int getId_additif() {
        return id_additif;
    }

    public void setId_additif(int id_additif) {
        this.id_additif = id_additif;
    }

    public String getLibelle_additif() {
        return libelle_additif;
    }

    public void setLibelle_additif(String libelle_additif) {
        this.libelle_additif = libelle_additif;
    }
}
