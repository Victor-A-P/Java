import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Pelicula;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        List<Pelicula> episodio = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        System.out.println("\n*********************************** ¡Bienvenido! **************************************");
        System.out.println("!Es importante que para la consulta tomes en cuenta que se realiza en el orden de estreno y no el numero del episodio como tal\n");

        while (true) {
            System.out.println("¿Quieres consultar una pelicula de la saga?");
            System.out.println("En caso de que quieras salir presiona el numero 0");
            System.out.print("Escribe el número de la pelicula, de la que quieres saber la información: ");
            int busqueda = teclado.nextInt();

            if (busqueda == 0) {
                break;
            } else {

                String direccion = "https://swapi.py4e.com/api/films/" + busqueda + "/";

                try {
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(direccion))
                            .build();
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());


                    String json = response.body();
                   // System.out.println(json);
                    Pelicula pelicula = gson.fromJson(json, Pelicula.class);
                    System.out.println("\nLa pelicula numero " + busqueda +" corresponde a: "+pelicula);
                    episodio.add(pelicula);

                }catch (NumberFormatException e)
                    {
                        System.out.println("Ocurrió un error: ");
                        System.out.println(e.getMessage());
                    }catch(IllegalArgumentException e)
                        {
                            System.out.println("Error en la URI, verifique la dirección.");
                        }

            }


        }

        System.out.println("La lista completa de las consultas fue: \n" + episodio);
        FileWriter escritura = new FileWriter("episodiosBuscados.json");
        escritura.write(gson.toJson(episodio));
        escritura.close();
        System.out.println("\nGracias por hacer uso de este sistema de consulta\nMay the force be with you!");
    }
}