package screenmach.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import screenmach.exception.ErrorEnConversionDeDuracionException;
import screenmach.modelos.Titulo;
import screenmach.modelos.TituloOMDb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        List<Titulo> titulo = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (true)
        {

            System.out.println("Escribe el nombre de la pelicula: ");
            var busqueda = teclado.nextLine();

            if (busqueda.equalsIgnoreCase("salir"))
            {
                break;
            }

            String direccion = "http://www.omdbapi.com/?t=" + busqueda.replace(" ","+") + "&apikey=a3e9dcf1";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());


              String json = response.body();
//                System.out.println(json);
//
//
               TituloOMDb mitituloOmdb = gson.fromJson(json, TituloOMDb.class);
//                System.out.println(mitituloOmdb);


                Titulo mititulo = new Titulo(mitituloOmdb);
                System.out.println(" Despues del  OMDb: " + mititulo);

                titulo.add(mititulo);
//                FileWriter escritura = new FileWriter("peliculas.txt");
//                escritura.write(mititulo.toString());
//                escritura.close();

// ! Una alternativa puede ser
//            try {
//                File archivo = new File("archivo.json");
//                Scanner scanner = new Scanner(archivo);
//
//                while (scanner.hasNextLine()) {
//                    String linea = scanner.nextLine();
//                    System.out.println(linea);
//                }
//                scanner.close();
//            } catch (FileNotFoundException e) {
//                System.out.println("Archivo no encontrado!");
//            }
            }
            catch (NumberFormatException e){
                System.out.println("Ocurrió un error: ");
                System.out.println(e.getMessage());
            }catch(IllegalArgumentException e){
                System.out.println("Error en la URI, verifique la dirección.");
            }catch (ErrorEnConversionDeDuracionException e){
                System.out.println(e.getMessage());
            }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println("\nOcurrio un error con la URI: ");
//            System.out.println(e.getMessage());
//        }
//        catch (NumberFormatException e)
//        {
//            System.out.println("\nOcurrio un error: ");
//            System.out.println(e.getMessage());
//        }Esta excepción ya no es necesaria ya que es hija de la anterior y por ende entra dentro de las excepciones que atrapa la anterior
//            finally{
//                System.out.println("\nFinalizo la ejeción del Programa");
//            } Pedazo de codigo que siempre se debe de ejecutar sin importar si se generan excepciones o no
        }

        System.out.println(titulo);
        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(titulo));
        escritura.close();


    }
}
