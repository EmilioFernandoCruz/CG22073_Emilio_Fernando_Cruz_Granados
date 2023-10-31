import java.util.Scanner;

public class Ejercicio_8_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] num = new int[10];
        int cantidadNum = 0; 
        
        // Leer 8 números
        while (cantidadNum < 8) {
            System.out.print("Escribe un número: ");
            int numero = scanner.nextInt();
            num[cantidadNum] = numero;
            cantidadNum++;
        }
        
        // Mostrar el array antes de la integracion
        System.out.println("Arreglo(array) antes de la integración:");
        for (int var = 0; var < cantidadNum; var++) {
            System.out.print(num[var] + " ");
        }
        System.out.println();

        System.out.print("Escribe el número a colocar: ");
        int numA_colocar = scanner.nextInt();
        
        System.out.print("Esccribe la posición del número (0-" + (cantidadNum - 1) + ") para la integración: ");
        int posicionNum = scanner.nextInt();
        
        if (posicionNum < 0 || posicionNum >= cantidadNum) {
            System.out.println("La posición de integración no es correcta");
            System.out.println("¡Intentelo de nuevo!.");
        } else {
           
            for (int var = cantidadNum - 1; var >= posicionNum; var--) {
                num[var + 1] = num[var];
            }
            num[posicionNum] = numA_colocar;
            
            cantidadNum++;
            
            // ver el array después de la inserción
            System.out.println("El Arreglo(array) después de la integración:");
            for (int var = 0; var < cantidadNum; var++) {
                System.out.print(num[var] + " ");
            }
        }
        
        scanner.close();
    }
}
