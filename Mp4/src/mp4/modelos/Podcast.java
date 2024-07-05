package mp4.modelos;

public class Podcast extends Audio{
    private String presentador;
    private String descripción;
    private String tema;

    @Override
    public int getClasificacion() {
        if (getTotalDeMeGusta() > 70) {
            return 5;
        } else {
            return 2;
        }
    }
    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
