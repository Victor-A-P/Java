package models;

import com.google.gson.annotations.SerializedName;

public class Pelicula {
    @SerializedName("title")
    private String title;
    @SerializedName("episode_id")
    private int chapter;
    @SerializedName("release_date")
    private String date;

    public Pelicula(String title, int chapter, String date) {
        this.title = title;
        this.chapter = chapter;
        this.date = date;
    }



    @Override
    public String toString() {
        return "\nTitulo: '" + title +"', Episodio: " + chapter + ", Fecha de estreno: " + date+ "\n";
    }
}
