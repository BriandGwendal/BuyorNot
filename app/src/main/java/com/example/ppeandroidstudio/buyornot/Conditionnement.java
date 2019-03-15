package com.example.ppeandroidstudio.buyornot;

public class Conditionnement {
    private int id_conditionnement;
    private String libelle_conditionnement;

    public Conditionnement() {
    }

    public Conditionnement(int id_conditionnement, String libelle_conditionnement) {
        this.id_conditionnement = id_conditionnement;
        this.libelle_conditionnement = libelle_conditionnement;
    }

    public int getId_conditionnement() {
        return id_conditionnement;
    }

    public void setId_conditionnement(int id_conditionnement) {
        this.id_conditionnement = id_conditionnement;
    }

    public String getLibelle_conditionnement() {
        return libelle_conditionnement;
    }

    public void setLibelle_conditionnement(String libelle_conditionnement) {
        this.libelle_conditionnement = libelle_conditionnement;
    }
}
