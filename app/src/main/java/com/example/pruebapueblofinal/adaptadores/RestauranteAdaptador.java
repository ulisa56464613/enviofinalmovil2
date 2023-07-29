package com.example.pruebapueblofinal.adaptadores;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebapueblofinal.R;

import com.example.pruebapueblofinal.moldes.RestauranteMolde;

import java.util.ArrayList;

public class RestauranteAdaptador extends RecyclerView.Adapter<RestauranteAdaptador.viewHolder> {

    //Atributos
    public ArrayList<RestauranteMolde> ListaRestaurantes;

    //Constructor
    public RestauranteAdaptador(ArrayList<RestauranteMolde> ListaRestaurantes) {
        this.ListaRestaurantes = ListaRestaurantes;
    }

    @NonNull
    @Override
    public RestauranteAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        @SuppressLint("InflateParams") View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.molderest,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(ListaRestaurantes.get(i));

    }

    @Override
    public int getItemCount() {
        return ListaRestaurantes.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView Descripcion;
        TextView Precio;
        ImageView fotrest;

        public viewHolder(View item){
            super (item);
            nombre=item.findViewById(R.id.titulorest);
            fotrest=item.findViewById(R.id.fotorest);
            Descripcion=item.findViewById(R.id.descrest);
            Precio=item.findViewById(R.id.precio);
        }

        public void actualizarDatos(RestauranteMolde molderestaurante) {
            nombre.setText(molderestaurante.getNombre());
            fotrest.setImageResource(molderestaurante.getFoto());
            Descripcion.setText(molderestaurante.getDescripcion());
            Precio.setText(molderestaurante.getRangoprecios());
        }
    }

}
