package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.adaptadores.RestauranteAdaptador;
import com.example.pruebapueblofinal.moldes.Moldehotel;
import com.example.pruebapueblofinal.moldes.RestauranteMolde;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {
        ArrayList<RestauranteMolde> listaRestaurantes=new ArrayList<>();
        RecyclerView recyclerRestaurantes;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_lista_restaurantes);
            recyclerRestaurantes = findViewById(R.id.listadeRestaurantes);
            recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

            crearLista();
            RestauranteAdaptador adaptador = new RestauranteAdaptador(listaRestaurantes);
            recyclerRestaurantes.setAdapter(adaptador);
        }

        public void crearLista(){
            listaRestaurantes.add(new RestauranteMolde("Hotel el descanso","230000","TIN",R.drawable.ho1));
            listaRestaurantes.add(new RestauranteMolde("Hotel nuevo amanecer","600000","TAN",R.drawable.na));
            listaRestaurantes.add(new RestauranteMolde("Hotel sol de uraba","23200","TON0",R.drawable.sol));
            listaRestaurantes.add(new RestauranteMolde("Hotel el aquel almendro","23000","IUY",R.drawable.h3));
            listaRestaurantes.add(new RestauranteMolde("Hotel antioquia plaza","235000","TGDE",R.drawable.h4));
        }
    }