package com.example.ppeandroidstudio.buyornot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AjouterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter);
    }

    public void addProduct(View view) {
        EditText editLibelle = findViewById(R.id.editLibelle);
        String libelle = editLibelle.getText().toString();

        Produit produit = new Produit();
        produit.setLibelle_produit(libelle);

        ProduitManager m = new ProduitManager(this);
        m.open();

        long id = m.addProduit(produit);

        Produit p = m.getProduit(id);

        Toast.makeText(getApplicationContext(), p.getLibelle_produit(), Toast.LENGTH_LONG).show();
    }
}
