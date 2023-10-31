import java.util.Scanner;

public class Ejercicio_10_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Arreglo de tamaño 10
        int[] arreglo = new int[10];
        
        System.out.println("Escribe 5 elementos numéricos ordenados de forma creciente:");
        int var = 0; // 
        while (var < 5) {
            arreglo[var] = sc.nextInt();
            var++;
        }
        
        System.out.print("Escribe el número N a agregar: ");
        int n = sc.nextInt();
        
        int ubicacion = 0;
        while (ubicacion < 5 && arreglo[ubicacion] < n) {
            ubicacion++;
        }
        
        int var2 = 4;
        while (var2 >= ubicacion) {
            arreglo[var2 + 1] = arreglo[var2];
            var2--;
        }
        
        arreglo[ubicacion] = n;
        
        System.out.println("Arreglo (array) después de la integración:");
        var = 0; 
        while (var < 6) {
            System.out.print(arreglo[var] + " ");
            var++;
        }
        
        sc.close();
    }
}
