package com.example.ppeandroidstudio.buyornot;

public class Label {

    private int id_label;
    private String libelle_label;

    // Constructeurs
    public Label() {
    }

    public Label(int id_label, String libelle_label) {
        this.id_label = id_label;
        this.libelle_label = libelle_label;
    }

    public int getId_label() {
        return id_label;
    }

    public void setId_label(int id_label) {
        this.id_label = id_label;
    }

    public String getLibelle_label() {
        return libelle_label;
    }

    public void setLibelle_label(String libelle_label) {
        this.libelle_label = libelle_label;
    }
}
