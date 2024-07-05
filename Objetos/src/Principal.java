import screenmach.calculos.CalculadorTiempo;
import screenmach.calculos.Filtro;
import screenmach.modelos.Episodio;
import screenmach.modelos.Pelicula;
import screenmach.modelos.Serie;

import java.sql.SQLOutput;


public class Principal {
    public static void main(String[] args) {
        Pelicula peli = new Pelicula(); // <-- Se hace referencia a un tipo de dato screenmach.modelos.Pelicula (Creado por nosotros) como: String peli
                        // <-- Poner new () ==> Esta instanciando, ¿que significa? Que crea un espacio en memoria para poder almacenar
                                                                                    //ese objeto[algo creado siguiendo los "planos" (Atributos) en la clase screenmach.modelos.Pelicula]
        peli.setNombre("Spiderverse 1");
        peli.setFechaDeLanzamiento(2019);
        peli.setDuracionEnMinutos(180);
        peli.setIncluidoEnElPlan(true);
        peli.muestraFichaTecnica();
        peli.evaluaPelicula(8.3);// <-- Primera evaluación de la pelicula
        peli.evaluaPelicula(10); // <-- Segunda evaluación de la pelicula
        peli.calculaMedia();

        Pelicula peli2 = new Pelicula();
        peli2.setNombre("El aprendiz del brujo");
        peli2.setFechaDeLanzamiento(2010);
        peli2.setDuracionEnMinutos(120);
        peli2.setIncluidoEnElPlan(false);

        peli2.muestraFichaTecnica();
        peli2.calculaMedia();
        //En caso de que se desee imprimir algun valor especifico ej. el nombre
        // Es necesario crear un getter del atriibuto y...
        //System.out.println(peli.getBandera()); <-- Hacer esto para mandarlo a llamar

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporada(3);
        casaDragon.setMinutosPorEpisodios(52);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println("La duración en minutos total de la serie es de:" + casaDragon.getDuracionEnMinutos());


        CalculadorTiempo calculadora = new CalculadorTiempo();
        calculadora.tiempoMaraton(peli);
        calculadora.tiempoMaraton(casaDragon);
        calculadora.tiempoMaraton(peli2);

        System.out.println("Si te quieres aventar un maraton con las peliculas, necesitarias: " + calculadora.getTiempoTotal() + " minutos");

        Filtro filtro = new Filtro();
        System.out.println(filtro.filtrar(peli) + peli.getNombre());
        System.out.println(filtro.filtrar(peli2) + peli2.getNombre());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("El comienzo");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(500);

        System.out.println(filtro.filtrar(episodio) +" '" + episodio.getNombre() + "' de la serie " + episodio.getSerie());
    }
}
