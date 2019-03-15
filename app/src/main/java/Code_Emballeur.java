public class Code_Emballeur {
    private int id_code_Emballeur;
    private String libelle_code_Emballeur;

    public Code_Emballeur() {
    }

    public Code_Emballeur(int id_code_Emballeur, String libelle_code_Emballeur) {
        this.id_code_Emballeur = id_code_Emballeur;
        this.libelle_code_Emballeur = libelle_code_Emballeur;
    }

    public int getId_code_Emballeur() {
        return id_code_Emballeur;
    }

    public void setId_code_Emballeur(int id_code_Emballeur) {
        this.id_code_Emballeur = id_code_Emballeur;
    }

    public String getLibelle_code_Emballeur() {
        return libelle_code_Emballeur;
    }

    public void setLibelle_code_Emballeur(String libelle_code_Emballeur) {
        this.libelle_code_Emballeur = libelle_code_Emballeur;
    }
}
