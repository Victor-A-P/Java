import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);// <-- Te permite recibir datos a traves de teclado.
        System.out.println("Escribe el nombre de tu pelicula fvorita: ");
        String pelicula = teclado.nextLine();
        System.out.println("Escribe la fecha de lanzamiento: ");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Como puntuas a esta pelicula? ");
        double nota = teclado.nextDouble(); // <-- Depende de la zona horaria Brazil se utiliza "," en vez de "."
        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
