import java.util.Scanner;

public class Ejercicio_9_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = leerArreglo(sc, 10);

        desplazarArreglo(num);

        mostrarArreglo(num);

        sc.close();
    }

    public static int[] leerArreglo(Scanner sc, int dimension) {
        int[] arreglo = new int[dimension];

        System.out.println("Escribe los " + dimension + " números enteros:");

        int var = 0; 
        while (var < dimension) {
            System.out.print("Número " + (var + 1) + ": ");
            arreglo[var] = sc.nextInt();
            var++;
        }

        return arreglo;
    }

    public static void desplazarArreglo(int[] arreglo) {
        int desplazarnumero = arreglo[arreglo.length - 1];

        int var = arreglo.length - 1; 
        while (var > 0) {
            arreglo[var] = arreglo[var - 1];
            var--;
        }

        arreglo[0] = desplazarnumero;
    }

    public static void mostrarArreglo(int[] arreglo) {
        System.out.println("Arreglo desplazandose una posición hacia abajo:");

        int var = 0; 
        while (var < arreglo.length) {
            System.out.println("Posición " + (var + 1) + ": " + arreglo[var]);
            var++;
        }
    }
}
