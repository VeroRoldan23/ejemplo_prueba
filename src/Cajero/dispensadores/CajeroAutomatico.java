package Cajero.dispensadores;
import java.util.Scanner;


public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Creación de la cadena de responsabilidad
        DispensadorBilletes dispensador5000 = new DispensadorBilletes(5000);
        DispensadorBilletes dispensador10000 = new DispensadorBilletes(10000);
        DispensadorBilletes dispensador20000 = new DispensadorBilletes(20000);
        DispensadorBilletes dispensador50000 = new DispensadorBilletes(50000);
        DispensadorBilletes dispensador100000 = new DispensadorBilletes(100000);
        
        // Configuración de la cadena
        dispensador100000.setSiguiente(dispensador50000);
        dispensador50000.setSiguiente(dispensador20000);
        dispensador20000.setSiguiente(dispensador10000);
        dispensador10000.setSiguiente(dispensador5000);
        
        // Solicitud de retiro
        System.out.println("Ingrese el monto a retirar (múltiplo de 5.000):");
        int monto = leer.nextInt();

        leer.close();
        System.out.println("Solicitando " + monto + " en el cajero:");
        
        dispensador100000.dispensar(monto);
    }
}
