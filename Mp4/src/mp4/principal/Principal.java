package mp4.principal;

import mp4.modelos.Cancion;
import mp4.modelos.Podcast;
import mp4.operaciones.Favoritos;

public class Principal {

    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        cancion.setTitulo("Love you baby");
        cancion.setCantante("Kiss");

        Podcast podcast = new Podcast();
        podcast.setPresentador("Siro");
        podcast.setTitulo("ADN 40 news late night");

        for (int i = 0; i < 100 ; i++) {
            cancion.meGusta();
            podcast.meGusta();
        }
        for (int i = 0; i <5554 ; i++) {
            cancion.reproduce();
            podcast.reproduce();
        }

        System.out.println("\nLa canción '" +cancion.getTitulo() + "' tiene un total de "
                            + cancion.getTotalDeReproducciones() + " reproducciones y "
                            +cancion.getTotalDeMeGusta() + " me gusta");

        System.out.println(String.format("\nEl Podcast '%s' tiene un total de %d reproducciones y %d me gusta"
                            ,podcast.getTitulo(),podcast.getTotalDeReproducciones(),podcast.getTotalDeMeGusta()));


        Favoritos favoritos = new Favoritos();
        favoritos.adiccionar(cancion);
        favoritos.adiccionar(podcast);

        System.out.println();
    }
}
