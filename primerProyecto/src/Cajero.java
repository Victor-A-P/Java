import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String name = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;
        int salir, opcion = 0;
        double retiro, deposito;

        System.out.println("***************************************************");
        System.out.println("\nBienvenido señor " + name);
        System.out.println("Su cuenta es de tipo: " +tipoCuenta);
        System.out.println("************************************************");
        System.out.println("""
                \n +++ Escriba el numero de la opcion deseada: +++
                1 - Consultar el saldo
                2 - Retirar
                3 - Despositar
                9 - Salir\n
                """);
            opcion = teclado.nextInt();

            while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 9)
            {
                System.out.println("Opción no válida");
                System.out.println("Digite otra opción");
                opcion = teclado.nextInt();
            }

        while (opcion == 1 || opcion == 2 || opcion == 3)
        {
            switch (opcion) {
                case 1:
                    System.out.println("\nEl saldo en su cuenta es de: " +saldo);
                    break;
                case 2:
                    System.out.println("\nEl saldo en la cuenta es de: " + saldo);
                    System.out.println("Cuanto desea retirar ? ");
                    retiro = teclado.nextDouble();

                    if (retiro <= saldo) {
                        saldo = saldo - retiro;
                        System.out.println("\nLa operación se realizo con exito");
                        System.out.println("El saldo actual ahora es: " +saldo);
                    } else {
                        while (retiro > saldo) {
                            System.out.println("\nLo sentimos, pero la cantidad que intenta retirar no se encuentra disponible");
                            System.out.println("Digite otra cantidad");
                            retiro = teclado.nextDouble();
                        }
                        saldo = saldo - retiro;
                        System.out.println("\nLa operación se realizo con exito");
                        System.out.println("El saldo actual ahora es: " +saldo);
                    }
                    break;
                case 3:
                    System.out.println("\nLa cantidad en cuenta es de: " + saldo);
                    System.out.println("Cuanto desea depositar ?");
                    deposito = teclado.nextDouble();

                    saldo = saldo + deposito;
                    System.out.println("\nLa cantidad en cuenta es de: " + saldo);
                    break;
                // otros casos posibles...
                default:
                    System.out.println("Error inesperado");
                    break;
            }

            System.out.println("\nDesea hacer alguna otra operación señor? ");
            System.out.println("""
                \n +++ Escriba el numero de la opcion deseada: +++
                1 - Consultar el saldo
                2 - Retirar
                3 - Despositar
                \n Para salir presione cualquier otra tecla 
                """);
            opcion = teclado.nextInt();
        }

        System.out.println("\nGracias por su visita señor " + name);
    }
}