package com.JQIndustries.Spotify.modelos;

public class MisFavoritos {

    public void agregarFavorito(Audio audio) {
        if(audio.getClasificacion() >= 10) {
            System.out.println("En tus favoritos");
        }else{
            System.out.println("Popular posible favoritos");
        }
    }

}
