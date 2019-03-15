package com.example.ppeandroidstudio.buyornot;

public class Pays {
    private String id_pays;
    private String libelle_pays;

    public Pays() {
    }

    public Pays(String id_pays, String libelle_pays) {
        this.id_pays = id_pays;
        this.libelle_pays = libelle_pays;
    }

    public String getId_pays() {
        return id_pays;
    }

    public void setId_pays(String id_pays) {
        this.id_pays = id_pays;
    }

    public String getLibelle_pays() {
        return libelle_pays;
    }

    public void setLibelle_pays(String libelle_pays) {
        this.libelle_pays = libelle_pays;
    }
}
