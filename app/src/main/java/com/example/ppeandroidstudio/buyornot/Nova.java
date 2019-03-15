package com.example.ppeandroidstudio.buyornot;

public class Nova {
    private String code_nova;
    private String libelle_nova;

    public Nova() {
    }

    public Nova(String code_nova, String libelle_nova) {
        this.code_nova = code_nova;
        this.libelle_nova = libelle_nova;
    }

    public String getCode_nova() {
        return code_nova;
    }

    public void setCode_nova(String code_nova) {
        this.code_nova = code_nova;
    }

    public String getLibelle_nova() {
        return libelle_nova;
    }

    public void setLibelle_nova(String libelle_nova) {
        this.libelle_nova = libelle_nova;
    }
}
