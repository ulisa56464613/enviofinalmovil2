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
import com.example.pruebapueblofinal.moldes.Moldehotel;
import java.util.ArrayList;

public class HotelAdaptador extends RecyclerView.Adapter<HotelAdaptador.viewHolder> {

    //Atributos
    public ArrayList<Moldehotel> Listah;

    //Constructor
    public HotelAdaptador(ArrayList<Moldehotel> Listah) {
        this.Listah = Listah;
    }

    @NonNull
    @Override
    public HotelAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        @SuppressLint("InflateParams") View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(Listah.get(i));

    }

    @Override
    public int getItemCount() {
        return Listah.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreHotel;
        TextView precioHotel;
        ImageView fotHotel;

        public viewHolder(View item){
            super (item);
            fotHotel=item.findViewById(R.id.fotoitem);
            nombreHotel=item.findViewById(R.id.tituloitem);
            precioHotel=item.findViewById(R.id.precioitem);
        }

        public void actualizarDatos(Moldehotel moldehotel) {
            fotHotel.setImageResource(moldehotel.getFoto());
            nombreHotel.setText(moldehotel.getNombre());
            precioHotel.setText(moldehotel.getPrecio());
        }
    }

}
