import java.util.Scanner;

public class Ejercicio_1_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Escribe 5 números, por favor:");

        int var = 0;
        while (var < 5) {
            System.out.print("Número " + (var + 1) + ": ");
            num[var] = scanner.nextInt();
            var++;
        }

        System.out.println("Los números que aparecen en pantalla son:");

        var = 0;
        while (var < 5) {
            System.out.println("Número " + (var + 1) + ": " + num[var]);
            var++;
        }

        scanner.close();
    }
}
