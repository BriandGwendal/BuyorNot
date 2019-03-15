package com.example.ppeandroidstudio.buyornot;

public class Categorie {
    private int id_categorie;
    private String code_categorie;
    private String libelle_categorie;

    public Categorie() {
    }

    public Categorie(int id_categorie, String code_categorie, String libelle_categorie) {
        this.id_categorie = id_categorie;
        this.code_categorie = code_categorie;
        this.libelle_categorie = libelle_categorie;
    }

    public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    public String getCode_categorie() {
        return code_categorie;
    }

    public void setCode_categorie(String code_categorie) {
        this.code_categorie = code_categorie;
    }

    public String getLibelle_categorie() {
        return libelle_categorie;
    }

    public void setLibelle_categorie(String libelle_categorie) {
        this.libelle_categorie = libelle_categorie;
    }
}
