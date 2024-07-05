package polimorfismo;

// POLIMORFISMO DE INTERFACES


interface Figura {
    double calcularArea();
}
/* Definición: => Una interfaz es una lista de métodos (acciones) que una clase debe implementar.

Estructura: => Solo contiene declaraciones de métodos, sin implementación.
               Puede incluir constantes (variables que no cambian).


Uso: => Las clases "implementan" interfaces.
        Una clase puede implementar múltiples interfaces.


Propósito: => Establece un contrato de comportamiento.
              Permite el polimorfismo.

Ej.
interface Animal {
    void hacerSonido();
    void moverse();
}

class Perro implements Animal {
    public void hacerSonido() {
        System.out.println("Guau");
    }
    public void moverse() {
        System.out.println("El perro corre");
    }
}

En este ejemplo, Animal es la interfaz que define qué deben hacer los animales.
Perro es una clase que implementa esta interfaz, proporcionando su propia versión de los métodos.
Las interfaces son útiles para definir comportamientos comunes entre clases diferentes,
sin importar cómo se implementen internamente.
 */


class Circulo implements Figura {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo implements Figura {
    double longitud, ancho;

    Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return longitud * ancho;
    }
}

public class Area {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5.0);
        Figura figura2 = new Rectangulo(4.0, 3.0);

        System.out.println("Área del círculo: " + figura1.calcularArea()); // Salida: Área del círculo: 78.54
        System.out.println("Área del rectángulo: " + figura2.calcularArea()); // Salida: Área del rectángulo: 12.0
    }
}
