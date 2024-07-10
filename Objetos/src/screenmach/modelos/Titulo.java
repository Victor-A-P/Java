package screenmach.modelos;

import com.google.gson.annotations.SerializedName;
import screenmach.calculos.Clasificacion;
import screenmach.exception.ErrorEnConversionDeDuracionException;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDeLanzamiento;

    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int bandera;
    //Metodo

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOMDb mitituloOmdb) {
        this.nombre = mitituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(mitituloOmdb.year());
        if (mitituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException("No pude convertir la duracion, porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(
                mitituloOmdb.runtime().substring(0,3).replace(" ","")
        );
        this.duracionEnMinutos = Integer.valueOf(mitituloOmdb.runtime().substring(0,3).replace(" ", ""));

    }

    //Se utilizan los set para que se pueda acceder a ellos desde otras clases y otros paquetes
    public void setNombre(String nombre) {
        this.nombre = nombre;
        //el 'this' indica que se refiere a el atributo de la clase
        //y normalmente se utiliza cuando en el metodo hay un parametro
        // con el mismo nombre de un atributo de la clase
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    //Getter

    public int getBandera() {
        return bandera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }
    //tipo: Void => porque no esperamos que devuelva nada, solo se quiere ejecutar

    // Para mostrar la información de las peliulas
    public void muestraFichaTecnica()
    {
        System.out.println("\nEl nombre de la pelicula es '" + nombre
                +"' con una duración de " + getDuracionEnMinutos() // esto permite que vea cual de los 2 metodos llama
                + " minutos que se estreno en " + fechaDeLanzamiento);
    }

    // Para evaluar a la peliculas
    public void evaluaPelicula(double nota)
    {
        sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
        bandera = bandera + 1;

    }

    public void calculaMedia()
    {
        System.out.println("Rated: " + sumaDeLasEvaluaciones / bandera + " estrellas de 10 con " +bandera + " reseñas");
    }

    public int rate(){
        return (int) (sumaDeLasEvaluaciones / bandera);
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "\nNombre: '" + nombre +"' Fecha de estreno: " + fechaDeLanzamiento+ " Duración en minutos: " + duracionEnMinutos;
    }
}