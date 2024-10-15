package com.JQIndustries.Spotify.principal;

import com.JQIndustries.Spotify.modelos.Cancion;
import com.JQIndustries.Spotify.modelos.MisFavoritos;
import com.JQIndustries.Spotify.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Cancion c = new Cancion();
        c.setTitulo("hola");
        c.setCantante("hi");

        Podcast p = new Podcast();
        p.setTitulo("el programador");
        p.setDescripcion("hola ");
        p.setPresentacion("josue q");

        for (int i = 0; i < 100; i++) {
            c.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            c.reproducciones();
        }

        System.out.println("Total de reproducciones: " + c.getTotalReproducciones());
        System.out.println("Total de me gusta: " + c.getMeGusta());
        c.favoritos();

        MisFavoritos m = new MisFavoritos();
        m.agregarFavorito(c);
        m.agregarFavorito(p);

    }
}
