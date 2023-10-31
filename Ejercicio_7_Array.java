import java.util.Scanner;

public class Ejercicio_7_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[10];

        System.out.println("Escribe 10 números enteros  por favor:");

        int var = 0; 

        while (var < 10) {
            System.out.print("Número " + (var + 1) + ": ");
            num[var] = scanner.nextInt();
            var++;
        }

        boolean Valorcreciente = true, Valordecreciente = true;

        var = 0; 
        while (var < 9) {
            if (num[var] < num[var + 1]) {
                Valordecreciente = false;
            }
            if (num[var] > num[var + 1]) {
                Valorcreciente = false;
            }
            var++;
        }

        if (Valorcreciente && Valordecreciente) {
            System.out.println("La serie está desordenada.");
        } else if (Valorcreciente) {
            System.out.println("Los números están ordenados de forma creciente.");
        } else if (Valordecreciente) {
            System.out.println("Los números están ordenados de forma decreciente.");
        } else {
            System.out.println("Todos los números son idénticos.");
        }

        scanner.close();
    }
}
