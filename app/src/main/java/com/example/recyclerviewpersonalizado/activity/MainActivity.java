package com.example.recyclerviewpersonalizado.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewpersonalizado.PersonajeVo;
import com.example.recyclerviewpersonalizado.R;
import com.example.recyclerviewpersonalizado.adapters.AdaptadorPersonajes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PersonajeVo> personajeVos;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personajeVos = new ArrayList<PersonajeVo>();
        recyclerView = (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    
        llenarPersonajes();

        AdaptadorPersonajes adaptadorPersonajes = new AdaptadorPersonajes(personajeVos);
        recyclerView.setAdapter(adaptadorPersonajes);
    }

    private void llenarPersonajes() {
        personajeVos.add(new PersonajeVo("Familia Simpson", "Personajes donde la pelicula se destacan por su locuras.", R.drawable.cuatroa));
        personajeVos.add(new PersonajeVo("Homero", "Padre loco con su hijo y no sabe cuidar su esposa.", R.drawable.dosa));
        personajeVos.add(new PersonajeVo("Familia Simp", "Programa de presenatacion nc.", R.drawable.tresa));
        personajeVos.add(new PersonajeVo("Cerveza", "Bebida con alcohol un poco vigorizante.", R.drawable.cincoa));
        personajeVos.add(new PersonajeVo("Logo b", "Permite la mejor comunicacion visual.", R.drawable.seisa));
        personajeVos.add(new PersonajeVo("FLI", "Lindos personajes con un hermoso fin.", R.drawable.unoa));
    }
}
