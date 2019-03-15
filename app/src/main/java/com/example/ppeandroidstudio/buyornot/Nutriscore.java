package com.example.ppeandroidstudio.buyornot;

public class Nutriscore {

    private int id_nutriscore;
    private String libelle_nutriscore;

    // Constructeurs
    public Nutriscore() {
    }

    public Nutriscore(int id_nutriscore, String libelle_nutriscore) {
        this.id_nutriscore = id_nutriscore;
        this.libelle_nutriscore = libelle_nutriscore;
    }

    public int getId_nutriscore() {
        return id_nutriscore;
    }

    public void setId_nutriscore(int id_nutriscore) {
        this.id_nutriscore = id_nutriscore;
    }

    public String getLibelle_nutriscore() {
        return libelle_nutriscore;
    }

    public void setLibelle_nutriscore(String libelle_nutriscore) {
        this.libelle_nutriscore = libelle_nutriscore;
    }
}
