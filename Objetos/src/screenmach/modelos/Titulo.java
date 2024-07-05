package screenmach.modelos;

import screenmach.calculos.Clasificacion;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int bandera;
    //Metodo

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
}