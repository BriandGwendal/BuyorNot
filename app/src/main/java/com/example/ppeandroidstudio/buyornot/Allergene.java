package com.example.ppeandroidstudio.buyornot;

public class Allergene {

    private int id_allergene;
    private String libelle_allergene;

    // Constructeurs
    public Allergene() {
    }

    public Allergene(int id_allergene, String libelle_allergene) {
        this.id_allergene = id_allergene;
        this.libelle_allergene = libelle_allergene;
    }

    public int getId_allergene() {
        return id_allergene;
    }

    public void setId_allergene(int id_allergene) {
        this.id_allergene = id_allergene;
    }

    public String getLibelle_allergene() {
        return libelle_allergene;
    }

    public void setLibelle_allergene(String libelle_allergene) {
        this.libelle_allergene = libelle_allergene;
    }
}
