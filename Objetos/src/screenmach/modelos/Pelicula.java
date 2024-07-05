package screenmach.modelos;

import screenmach.calculos.CalculadorTiempo;
import screenmach.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
                        //extends sirve para indicar que hay una herencia desde titulo
                        // y hereda los atributos de titulo
                        // !!! Es IMPORTANTE destacar que no es posible multiple herencia,
                        // Para ello es necesario hacer un truckutru y hacer una jerarquia
                        // Es decir: el hijo hereda al padre => el padre hereda al abuelo => el abuelo es la superclase
                        // y de esta manera el hijo hereda al padre y al abuelo

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (rate()/2);
    }
}