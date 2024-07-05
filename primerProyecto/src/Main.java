//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenid@ a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento =1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = (8.2 + 6.0 + 9.90) /3;
         int ou = 5;
         int oi = 5;

         int imprimeou = ++ou;
         int imprimeoi = oi++;

        System.out.println(media);
        System.out.println("imprimeou: " + imprimeou);
        System.out.println("imprimeoi: " + imprimeoi);
        System.out.println(oi);


        //Convenciones establecidas por Oracle
            //Nombre de clases con Mayuscula y seguir convencion UpperCamelCase
                //EJ. -> MiClaseUno

            //Nombre de métodos con letra minuscula y seguir CamelCase
                //Ej. -> miMetodo()

            //nombre de las variables con minuscula y utilizar camelCase
                //Ej. -> mi Variable

        //Maximo de 80 lineas de caracteres por linea de codigo
        //Uso de espacios para operadores, palabras clave y elementos de flujo


        String sipnosis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sipnosis);


        /*  Para comparar strings es necesario utilizar el operador ==
        SIN EMBARGO esto solo compara si las dos variables apuntan al mismo objeto en la memoria

         Por ello para comparar un string es necesario usar el metodo equals()
         o equalsIsIgnoreCase() -> para que no distinga minusculas y mayusculas*/

        /*!

            Para formatear texto format()
            por ello se utiliza marcadores de posicion(Placeholders) -> Representados por %

            %s -> Indica que se insertará una cadena
            %d -> Indica que se insertará un valor entero
            %f -> float
        !*/

        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));


        //Casting
        int x = 10;
        double y = x; // Se esta generando un casting implicito

        double j = 92.53;
        int z = (int)j; //Se genera el casting explicitamente

        double celcius = 0;
        double farenheit = (celcius * 1.8) +32;

        int temperatura = (int)farenheit;

        System.out.println(String.format("%f grados centigrados equivale a %d farenheit", celcius, temperatura));



    }
}
