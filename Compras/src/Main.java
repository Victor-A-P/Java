import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el limite de la Tarjeta de Credito: ");

        double limite = teclado.nextDouble();
        var tarjeta = new TarjetaDeCredito(limite);

        int salir = 1;
         while (salir != 0)
         {
             System.out.println("Escribe la descripción de la compra: ");
             String descripcion = teclado.next();

             System.out.println("Escriba el valor de la compra: ");
             double valor = Double.valueOf(teclado.next());


             Compra compra = new Compra(valor, descripcion);
             boolean compraRealizada = tarjeta.lanzarCompra(compra);

             if (compraRealizada)
             {
                 System.out.println(" Compra realizada !");
                 System.out.println("Esciba 0 para salir o 1 para continuar");
                 salir = teclado.nextInt();
             }else{
                 System.out.println("Saldo insuficiente");
                 salir = 0;
                  }
         }
        System.out.println("**************************************************************");
        System.out.println("Compras realizadas\n");
        Collections.sort(tarjeta.getListaDeCompras());
        for (Compra compra : tarjeta.getListaDeCompras())
        {
            System.out.println(compra.getDescripcion() + " - " + compra.getValor());
        }

        System.out.println("\n************************************************************* ");
        System.out.println("Saldo de la Tarjeta" + tarjeta.getSaldo());
     }
}