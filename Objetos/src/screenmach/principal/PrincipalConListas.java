package screenmach.principal;

import screenmach.modelos.Pelicula;
import screenmach.modelos.Serie;
import screenmach.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {

        var peli = new Pelicula("Spiderverse 1",2019);
        peli.evaluaPelicula(9.4);
        Pelicula peli2 = new Pelicula("El aprendiz del brujo",2010);
        peli2.evaluaPelicula(7.4);
        var peli3 = new Pelicula("El señor de los anillos",2001);
        peli3.evaluaPelicula(10);
        Serie casaDragon = new Serie("La casa del Dragon",2022,3);
        // ? Cabe aclarar que cuando se declara de esta manera es un puntero al espacio de memoria
        // ? con identificador hexadecimal; y al hacer esto se esta creando un nuevo bloque de memoria que almacena esta info


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peli);
        lista.add(peli2);
        lista.add(peli3);
        lista.add(casaDragon);

//        for (Titulo item: lista)
//        {
//            System.out.println(item.getNombre());
//            Pelicula pelicula = (Pelicula) item; // Haciendo un casteo para forzar que las series sean peliculas
//            System.out.println(pelicula.getClasificacion());
//
//        }

        for (Titulo item: lista)
        {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula) // <-- Esto le pregunta si item es una instancia de tipo pelicula y se crea una variable de referencia
            {
                System.out.println(pelicula.getClasificacion());
            }

        }

       //lista.forEach(item -> System.out.println("\n" +item));  --> Para reemplazar al for eacht


        List<String> artistas = new ArrayList<>();
//        Esto se realiza con una interfaz que incluye diferentes tipos de arreglos es por eso que es posible el ver
//        todo sin problemas, ya que dentro de list se incluye arraylist y en caso de que se desee se podría cambiar el
//        tipo de lista a linkedlist, vectores, etc
        // clase Set<> no permite que se repitan los valores en la lista
        // MAP claves y valores para grandes cantidades de datos
        artistas.add("Tom Cruise");
        artistas.add("Salma Hayek");
        artistas.add("Cris Hemphsword");
        artistas.add("Robert Downy Jr");

        // ? Arraylist y LinkList[esta vinculada al siguiente => es util cuando se añaden y eliminan frecuentemente elementos]


        System.out.println("Lista de artistas sin ordenar: " +artistas);
        Collections.sort(artistas);
        System.out.println("Lista de artistas ordenada: " +artistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordena: " +lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " +lista);
    }
}
