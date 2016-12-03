package id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.model.hijaiyah;

public class MenuAwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);
        findViewById(R.id.mainmenu).setBackgroundColor(Color.parseColor("#2ecc71"));
        findViewById(R.id.buttonLagu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuAwal.this, LaguActivity.class));
            }
        });

        findViewById(R.id.buttonDoa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuAwal.this, DoaActivity.class));
            }
        });
        findViewById(R.id.buttonHuruf).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuAwal.this, hijaiyah.class));
            }
        });
    }
}