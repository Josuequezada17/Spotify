package com.JQIndustries.Spotify.modelos;

public class Audio {

    private String titulo;
    private double duracion;
    private int totalReproducciones;
    private int meGusta;
    private int clasificacion;

    public void meGusta(){
            this.meGusta++;
    }

    public void reproducciones(){
        this.totalReproducciones++;
    }

    public void favoritos(){
        return ;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
