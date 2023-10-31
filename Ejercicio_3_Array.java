import java.util.Scanner;

public class Ejercicio_3_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("Escribe 10 números enteros : ");

        int var = 0; // Inicializamos la variable de control fuera del bucle

        while (var < 10) {
            System.out.print("Número " + (var + 1) + ": ");
            num[var] = scanner.nextInt();
            var++;
        }

        var = 0; // Reiniciamos la variable de control para el segundo bucle

        while (var < 10 / 2) {
            System.out.println(num[var]);
            System.out.println(num[9 - var]);
            var++;
        }

        scanner.close();
    }
}
