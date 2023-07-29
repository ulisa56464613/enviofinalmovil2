package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.moldes.Moldehotel;

import java.util.ArrayList;

public class Listah extends AppCompatActivity {
    ArrayList<Moldehotel>listaHoteles=new ArrayList<>();
    RecyclerView recyclerhoteles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listah);
        recyclerhoteles = findViewById(R.id.listadehoteles);
        recyclerhoteles.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearLista();
        HotelAdaptador adaptador = new HotelAdaptador(listaHoteles);
        recyclerhoteles.setAdapter(adaptador);
    }

    public void crearLista(){
        listaHoteles.add(new Moldehotel("Hotel el descanso","230000",R.drawable.ho1));
        listaHoteles.add(new Moldehotel("Hotel nuevo amanecer","600000",R.drawable.na));
        listaHoteles.add(new Moldehotel("Hotel sol de uraba","23200",R.drawable.sol));
        listaHoteles.add(new Moldehotel("Hotel el aquel almendro","23000",R.drawable.h3));
        listaHoteles.add(new Moldehotel("Hotel antioquia plaza","235000",R.drawable.h4));

    }
}