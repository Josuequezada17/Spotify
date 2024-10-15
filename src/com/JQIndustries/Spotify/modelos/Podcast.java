package com.JQIndustries.Spotify.modelos;

public class Podcast extends Audio{

    private String presentacion;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if(getTotalReproducciones() >= 200){
            return 10;
        }else {
            return 5;
        }
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
