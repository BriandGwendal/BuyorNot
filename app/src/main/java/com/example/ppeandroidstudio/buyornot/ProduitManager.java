package com.example.ppeandroidstudio.buyornot;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ProduitManager {
    private static final String TABLE_NAME = "produit";
    public static final String KEY_ID_PRODUIT="id_produit";
    public static final String KEY_LIBELLE_PRODUIT="libelle_produit";
    public static final String KEY_CODE_BARRE_PRODUIT="codeBarre_produit";
    public static final String KEY_QUANTITE_PRODUIT="quantite_produit";
    public static final String KEY_INGREDIENT_PRODUIT="ingredient_produit";
    public static final String KEY_ENERGIE_PRODUIT="energie_produit";
    public static final String KEY_MATIERE_GRASSE_PRODUIT="matiereGrasse_produit";
    public static final String KEY_ACIDES_GRAS_PRODUIT="acidesGras_produit";
    public static final String KEY_GLUCIDES_PRODUIT="glucides_produit";
    public static final String KEY_SUCRES_PRODUIT="scures_produit";
    public static final String KEY_PROTEINE_PRODUIT="proteine_produit";
    public static final String KEY_SEL_PRODUIT="sel_produit";
    public static final String KEY_SODIUM_PRODUIT="sodium_produit";
    public static final String KEY_LIEN_PRODUIT="lien_produit";

    public static final String CREATE_TABLE_ANIMAL = "CREATE TABLE " + TABLE_NAME +
            " (" +
            " " + KEY_ID_PRODUIT + " INTEGER primary key," +
            " " + KEY_LIBELLE_PRODUIT + " TEXT" +
            " " + KEY_CODE_BARRE_PRODUIT + " INT" +
            " " + KEY_QUANTITE_PRODUIT + " INT" +
            " " + KEY_INGREDIENT_PRODUIT + " TEXT" +
            " " + KEY_ENERGIE_PRODUIT + " INT" +
            " " + KEY_MATIERE_GRASSE_PRODUIT + " INT" +
            " " + KEY_ACIDES_GRAS_PRODUIT + " INT" +
            " " + KEY_GLUCIDES_PRODUIT + " INT" +
            " " + KEY_SUCRES_PRODUIT + " INT" +
            " " + KEY_PROTEINE_PRODUIT + " INT" +
            " " + KEY_SEL_PRODUIT + " INT" +
            " " + KEY_SODIUM_PRODUIT + " INT" +
            " " + KEY_LIEN_PRODUIT + " TEXT" +
            ");";
    private MySQLite maBaseSQLite; // notre gestionnaire du fichier SQLite
    private SQLiteDatabase db;

    // Constructeur
    public ProduitManager(Context context)
    {
        maBaseSQLite = MySQLite.getInstance(context);
    }

    public void open()
    {
        //on ouvre la table en lecture/écriture
        db = maBaseSQLite.getWritableDatabase();
    }

    public void close()
    {
        //on ferme l'accès à la BDD
        db.close();
    }

    public long addProduit(Produit produit) {
        // Ajout d'un enregistrement dans la table

        ContentValues values = new ContentValues();
        values.put(KEY_LIBELLE_PRODUIT, produit.getLibelle_produit());
        values.put(KEY_CODE_BARRE_PRODUIT, produit.getCode_barre_produit());
        values.put(KEY_QUANTITE_PRODUIT, produit.getQuantite_produit());
        values.put(KEY_INGREDIENT_PRODUIT, produit.getIngredient_produit());
        values.put(KEY_ENERGIE_PRODUIT, produit.getEnergie_produit());
        values.put(KEY_MATIERE_GRASSE_PRODUIT, produit.getMatiere_grasse_produit());
        values.put(KEY_ACIDES_GRAS_PRODUIT, produit.getAcides_gras_produit());
        values.put(KEY_GLUCIDES_PRODUIT, produit.getGlucides_produit());
        values.put(KEY_SUCRES_PRODUIT, produit.getSucres_produit());
        values.put(KEY_PROTEINE_PRODUIT, produit.getProteine_produit());
        values.put(KEY_SEL_PRODUIT, produit.getSel_produit());
        values.put(KEY_SODIUM_PRODUIT, produit.getSodium_produit());
        values.put(KEY_LIEN_PRODUIT, produit.getLien_produit());
        // insert() retourne l'id du nouvel enregistrement inséré, ou -1 en cas d'erreur
        return db.insert(TABLE_NAME,null, values);
    }

    public int modProduit(Produit produit) {
        // modification d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la requête

        ContentValues values = new ContentValues();
        values.put(KEY_LIBELLE_PRODUIT, produit.getLibelle_produit());
        values.put(KEY_CODE_BARRE_PRODUIT, produit.getCode_barre_produit());
        values.put(KEY_QUANTITE_PRODUIT, produit.getQuantite_produit());
        values.put(KEY_INGREDIENT_PRODUIT, produit.getIngredient_produit());
        values.put(KEY_ENERGIE_PRODUIT, produit.getEnergie_produit());
        values.put(KEY_MATIERE_GRASSE_PRODUIT, produit.getMatiere_grasse_produit());
        values.put(KEY_ACIDES_GRAS_PRODUIT, produit.getAcides_gras_produit());
        values.put(KEY_GLUCIDES_PRODUIT, produit.getGlucides_produit());
        values.put(KEY_SUCRES_PRODUIT, produit.getSucres_produit());
        values.put(KEY_PROTEINE_PRODUIT, produit.getProteine_produit());
        values.put(KEY_SEL_PRODUIT, produit.getSel_produit());
        values.put(KEY_SODIUM_PRODUIT, produit.getSodium_produit());
        values.put(KEY_LIEN_PRODUIT, produit.getLien_produit());


        String where = KEY_ID_PRODUIT+" = ?";
        String[] whereArgs = {produit.getId_produit()+""};

        return db.update(TABLE_NAME, values, where, whereArgs);
    }

    public int supProduit(Produit produit) {
        // suppression d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la clause WHERE, 0 sinon

        String where = KEY_ID_PRODUIT+" = ?";
        String[] whereArgs = {produit.getId_produit()+""};

        return db.delete(TABLE_NAME, where, whereArgs);
    }

    public Produit getProduit(int id) {
        // Retourne le produit dont l'id est passé en paramètre

        Produit p = new Produit();

        Cursor c = db.rawQuery("SELECT * FROM "+TABLE_NAME+" WHERE "+KEY_ID_PRODUIT+"="+id, null);
        if (c.moveToFirst()) {
            p.setId_produit(c.getInt(c.getColumnIndex(KEY_ID_PRODUIT)));
            p.setLibelle_produit(c.getString(c.getColumnIndex(KEY_LIBELLE_PRODUIT)));
            p.setCode_barre_produit(c.getString(c.getColumnIndex(KEY_CODE_BARRE_PRODUIT)));
            p.setQuantite_produit(c.getInt(c.getColumnIndex(KEY_QUANTITE_PRODUIT)));
            p.setIngredient_produit(c.getString(c.getColumnIndex(KEY_INGREDIENT_PRODUIT)));
            p.setEnergie_produit(c.getInt(c.getColumnIndex(KEY_ENERGIE_PRODUIT)));
            p.setMatiere_grasse_produit(c.getInt(c.getColumnIndex(KEY_MATIERE_GRASSE_PRODUIT)));
            p.setAcides_gras_produit(c.getInt(c.getColumnIndex(KEY_ACIDES_GRAS_PRODUIT)));
            p.setGlucides_produit(c.getInt(c.getColumnIndex(KEY_GLUCIDES_PRODUIT)));
            p.setSucres_produit(c.getInt(c.getColumnIndex(KEY_SUCRES_PRODUIT)));
            p.setProteine_produit(c.getInt(c.getColumnIndex(KEY_PROTEINE_PRODUIT)));
            p.setSel_produit(c.getInt(c.getColumnIndex(KEY_SEL_PRODUIT)));
            p.setSodium_produit(c.getInt(c.getColumnIndex(KEY_SODIUM_PRODUIT)));
            p.setLien_produit(c.getString(c.getColumnIndex(KEY_LIEN_PRODUIT)));


            c.close();
        }

        return p;
    }

    public Cursor getProduits() {
        // sélection de tous les enregistrements de la table
        return db.rawQuery("SELECT * FROM "+TABLE_NAME, null);
    }
}