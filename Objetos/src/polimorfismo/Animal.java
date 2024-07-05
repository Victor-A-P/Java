package polimorfismo;
//POLIMORFISMO DE CLASES (HERENCIA)

class Mascota {
    void hacerSonido() {
        System.out.println("Hace un sonido genérico");
    }
}
    class Perro extends Mascota {
        void hacerSonido() {
            System.out.println("El perro ladra");
        }
    }

    class Gato extends Mascota {
        void hacerSonido() {
            System.out.println("El gato maulla");
        }
    }

public class Animal {
    public static void main(String[] args) {
        Mascota miMascota = new Perro();

        miMascota.hacerSonido(); // Salida: El perro ladra

        miMascota = new Gato();
        miMascota.hacerSonido(); // Salida: El gato maulla
    }
}
