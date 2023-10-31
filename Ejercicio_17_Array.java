public class Ejercicio_17_Array {
    public static void main(String[] args) {
        int[][] matrizOriginal = new int[3][3];
        int[][] matrizTranspuesta = new int[3][3];
        int matrizFila = 3;
        int matrizColumna = 3;

        
        System.out.println("Mostrar la matriz original:");
        int matriz = 1;
        int var1 = 0;
        while (var1 < matrizFila) {
            int var2 = 0;
            while (var2 < matrizColumna) {
                matrizOriginal[var1][var2] = matriz;
                System.out.print(matrizOriginal[var1][var2] + " ");
                matriz++;
                var2++;
            }
            System.out.println();
            var1++;
        }

        System.out.println("\n Mostrar la Matriz Transpuesta:");
        var1 = 0;
        while (var1 < matrizFila) {
            int var2 = 0;
            while (var2 < matrizColumna) {
                matrizTranspuesta[var2][var1] = matrizOriginal[var1][var2];
                var2++;
            }
            var1++;
        }

        // Mostrar la matriz transpuesta
        var1 = 0;
        while (var1 < matrizColumna) {
            int var2 = 0;
            while (var2 < matrizFila) {
                System.out.print(matrizTranspuesta[var1][var2] + " ");
                var2++;
            }
            System.out.println();
            var1++;
        }
    }
}
