import java.util.Scanner;

public class Ejercicio_5_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el tamaño del array(arreglo): ");
        int var = scanner.nextInt();

        int[] arreglo = new int[var];


        System.out.println("Escribe el valor para el array(arreglo): ");
        for (int i = 0; i < var; i++) {
            arreglo[i] = scanner.nextInt();
        }

        int maximo = arreglo[0], minimo = arreglo[0];

        for (int i = 1; i < var; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        System.out.println("El valor máximo que se encontro es: " + maximo);
        System.out.println("El valor mínimo que se encontro es: " + minimo);
    scanner.close();
    }
}