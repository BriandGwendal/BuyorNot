package com.example.ppeandroidstudio.buyornot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*private void hideSystemUI() {

        View activity_main = getWindow().getDecorView();
        activity_main.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE);
    }*/
    public void afficherAjouter(View view){
        Intent intent = new Intent(this, AjouterActivity.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void afficherLister(View view){
        Intent intent = new Intent(this, ListerActivity.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
