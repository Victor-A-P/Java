package mp4.modelos;

public class Cancion extends Audio{
    private String cantante;
    private String genero;
    private String album;

    @Override
    public int getClasificacion() {
        if(getTotalDeMeGusta() >= 100)
        {
            return 8;
        }else {
            return 4;
        }
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

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
