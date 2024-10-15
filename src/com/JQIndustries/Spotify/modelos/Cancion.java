package com.JQIndustries.Spotify.modelos;

public class Cancion extends Audio{

    private String album;
    private String cantante;
    private String genero;

    @Override
    public int getClasificacion() {
        if (getTotalReproducciones() > 100){
            System.out.println("Favoritos");
        }else {
            System.out.println("Popular");;
        }
        return 0;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
