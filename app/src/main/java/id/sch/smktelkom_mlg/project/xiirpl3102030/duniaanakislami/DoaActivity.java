package id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.adapter.adapterr;
import id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.model.modyel;

public class DoaActivity extends AppCompatActivity {

    ArrayList<modyel> mList = new ArrayList<>();
    adapterr mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.doa1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaActivity.this, Doa1Activity.class));
            }

        });

        findViewById(R.id.doa2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaActivity.this, Doa2Activity.class));
            }

        });

        findViewById(R.id.doa3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaActivity.this, Doa3Activity.class));
            }

        });

        findViewById(R.id.doa4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaActivity.this, Doa4Activity.class));
            }

        });

        findViewById(R.id.doa5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaActivity.this, Doa5Activity.class));
            }

        });

        findViewById(R.id.doa6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaActivity.this, Doa6Activity.class));
            }

        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}