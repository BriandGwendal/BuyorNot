package com.example.ppeandroidstudio.buyornot;

public class Produit {
    private int id_produit;
    private String libelle_produit;
    private String code_barre_produit;
    private int quantite_produit;
    private String ingredient_produit;
    private String energie_produit;
    private String matiere_grasse_produit;
    private String acides_gras_produit;
    private String glucides_produit;
    private String sucres_produit;
    private String proteine_produit;
    private String sel_produit;
    private String sodium_produit;
    private String nutriscore_produit;
    private String lien_produit;

    public Produit() {
    }

    public Produit(int id_produit, String libelle_produit, String code_barre_produit, int quantite_produit, String ingredient_produit, String energie_produit, String matiere_grasse_produit, String acides_gras_produit, String glucides_produit, String sucres_produit, String proteine_produit, String sel_produit, String sodium_produit, String nutriscore_produit, String lien_produit) {
        this.id_produit = id_produit;
        this.libelle_produit = libelle_produit;
        this.code_barre_produit = code_barre_produit;
        this.quantite_produit = quantite_produit;
        this.ingredient_produit = ingredient_produit;
        this.energie_produit = energie_produit;
        this.matiere_grasse_produit = matiere_grasse_produit;
        this.acides_gras_produit = acides_gras_produit;
        this.glucides_produit = glucides_produit;
        this.sucres_produit = sucres_produit;
        this.proteine_produit = proteine_produit;
        this.sel_produit = sel_produit;
        this.sodium_produit = sodium_produit;
        this.nutriscore_produit = nutriscore_produit;
        this.lien_produit = lien_produit;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public String getLibelle_produit() {
        return libelle_produit;
    }

    public void setLibelle_produit(String libelle_produit) {
        this.libelle_produit = libelle_produit;
    }

    public String getCode_barre_produit() {
        return code_barre_produit;
    }

    public void setCode_barre_produit(String code_barre_produit) {
        this.code_barre_produit = code_barre_produit;
    }

    public int getQuantite_produit() {
        return quantite_produit;
    }

    public void setQuantite_produit(int quantite_produit) {
        this.quantite_produit = quantite_produit;
    }

    public String getIngredient_produit() {
        return ingredient_produit;
    }

    public void setIngredient_produit(String ingredient_produit) {
        this.ingredient_produit = ingredient_produit;
    }

    public String getEnergie_produit() {
        return energie_produit;
    }

    public void setEnergie_produit(String energie_produit) {
        this.energie_produit = energie_produit;
    }

    public String getMatiere_grasse_produit() {
        return matiere_grasse_produit;
    }

    public void setMatiere_grasse_produit(String matiere_grasse_produit) {
        this.matiere_grasse_produit = matiere_grasse_produit;
    }

    public String getAcides_gras_produit() {
        return acides_gras_produit;
    }

    public void setAcides_gras_produit(String acides_gras_produit) {
        this.acides_gras_produit = acides_gras_produit;
    }

    public String getGlucides_produit() {
        return glucides_produit;
    }

    public void setGlucides_produit(String glucides_produit) {
        this.glucides_produit = glucides_produit;
    }

    public String getSucres_produit() {
        return sucres_produit;
    }

    public void setSucres_produit(String sucres_produit) {
        this.sucres_produit = sucres_produit;
    }

    public String getProteine_produit() {
        return proteine_produit;
    }

    public void setProteine_produit(String proteine_produit) {
        this.proteine_produit = proteine_produit;
    }

    public String getSel_produit() {
        return sel_produit;
    }

    public void setSel_produit(String sel_produit) {
        this.sel_produit = sel_produit;
    }

    public String getSodium_produit() {
        return sodium_produit;
    }

    public void setSodium_produit(String sodium_produit) {
        this.sodium_produit = sodium_produit;
    }

    public String getNutriscore_produit() {
        return nutriscore_produit;
    }

    public void setNutriscore_produit(String nutriscore_produit) {
        this.nutriscore_produit = nutriscore_produit;
    }

    public String getLien_produit() {
        return lien_produit;
    }

    public void setLien_produit(String lien_produit) {
        this.lien_produit = lien_produit;
    }
}
