package com.example.pruebapueblofinal.moldes;

public class RestauranteMolde {
    private static String nombre;
    private static String descripcion;
    private static String rangoprecios;
    private static int foto;

    public RestauranteMolde() {
    }

    public RestauranteMolde(String nombre, String descripcion, String rangoprecios, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rangoprecios = rangoprecios;
        this.foto = foto;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static String getRangoprecios() {
        return rangoprecios;
    }

    public void setRangoprecios(String rangoprecios) {
        this.rangoprecios = rangoprecios;
    }

    public static int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
