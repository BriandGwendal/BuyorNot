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
    public static final String CREATE_TABLE_ANIMAL = "CREATE TABLE " + TABLE_NAME +
            " (" +
            " " + KEY_ID_PRODUIT + " INTEGER primary key," +
            " " + KEY_LIBELLE_PRODUIT + " TEXT" +
            " " + KEY_CODE_BARRE_PRODUIT + " TEXT" +
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

        // insert() retourne l'id du nouvel enregistrement inséré, ou -1 en cas d'erreur
        return db.insert(TABLE_NAME,null, values);
    }

    public int modProduit(Produit produit) {
        // modification d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la requête

        ContentValues values = new ContentValues();
        values.put(KEY_LIBELLE_PRODUIT, produit.getLibelle_produit());

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
            c.close();
        }

        return p;
    }

    public Cursor getProduits() {
        // sélection de tous les enregistrements de la table
        return db.rawQuery("SELECT * FROM "+TABLE_NAME, null);
    }
}