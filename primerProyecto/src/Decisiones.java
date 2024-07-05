public class Decisiones {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento > 2022)
        {
            System.out.println("Peliculas más populares del siglo 21");
        }else
        {
            System.out.println("Peliculas Retro que vale la pena ver del siglo pasado");
        }

        String mensaje = (fechaDeLanzamiento < 2000)? "Aun NO es de la nueva era" : "Es de la nueva era";
        System.out.println(mensaje);

        String seleccionPelis= (incluidoEnElPlan && tipoPlan.equals("plus"))? "Disfrute de esta pelicula en su catalogo" : "Pelicula NO disponiible";
        System.out.println(seleccionPelis);


        //Como funciona el switc

        // switch (expresion) {
        //  case valor1:
        //    // código a ejecutar si la expresión es igual a valor1
        //    break;
        //  case valor2:
        //    // código a ejecutar si la expresión es igual a valor2
        //    break;
        //  // otros casos posibles...
        //  default:
        //    // código a ejecutar si ninguno de los casos anteriores se cumple
        //}

/*    int dia = 3;
      switch (dia) {
        case 1:
              System.out.println("El día 1 es lunes");
               break;
           case 2:
               System.out.println("El día 2 es martes");
              break;
          case 3:
              System.out.println("El día 3 es miércoles");
               break;
          // otros casos posibles...
           default:
               System.out.println("Día no válido");*/
        }
    }