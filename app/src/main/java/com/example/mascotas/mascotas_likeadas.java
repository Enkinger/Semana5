package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import com.example.mascotas.adapters.MascotaAdaptador;
import com.example.mascotas.models.Mascota;

import java.util.ArrayList;

public class mascotas_likeadas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    RecyclerView rvMascotasLikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_likeadas);

        Toolbar miActionbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionbar);
        setSupportActionBar(miActionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        rvMascotasLikes = (RecyclerView) findViewById(R.id.rvMascotasLikes);
        crearMascotas();
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);

        rvMascotasLikes.setLayoutManager(llm);

        rvMascotasLikes.setAdapter(new MascotaAdaptador(mascotas, this));

        iniciarAdaptador();

    }

    public void iniciarAdaptador(){

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        rvMascotasLikes.setAdapter(adaptador);

    }

    public void crearMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Moria",R.drawable.gato, 1));
        mascotas.add(new Mascota("Troomp", R.drawable.perro, 5));
        mascotas.add(new Mascota("Adereso", R.drawable.perro, 0));
        mascotas.add(new Mascota("Skandalasa",R.drawable.perro, 0));
        mascotas.add(new Mascota("Perrasa", R.drawable.gato, 3));


    }
}