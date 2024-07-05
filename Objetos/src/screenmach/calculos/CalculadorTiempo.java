package screenmach.calculos;

import screenmach.modelos.Pelicula;
import screenmach.modelos.Serie;
import screenmach.modelos.Titulo;


public class CalculadorTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void tiempoMaraton(Titulo titulo)
    {
        this.tiempoTotal = tiempoTotal + titulo.getDuracionEnMinutos();
    }


}
