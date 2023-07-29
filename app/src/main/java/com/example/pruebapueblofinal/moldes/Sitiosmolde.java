package com.example.pruebapueblofinal.moldes;

public class Sitiosmolde {
    private String nombre;
    private String precio;
    private String contacto;
    private int foto;

    public Sitiosmolde() {
    }

    public Sitiosmolde(String nombre, String precio, String contacto, int foto) {
        this.nombre = nombre;
        this.precio = precio;
        this.contacto = contacto;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
