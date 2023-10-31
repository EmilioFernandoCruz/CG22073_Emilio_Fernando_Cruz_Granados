public class Ejercicio_18_Array {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        int matrizFila = 7;
        int matrizColumna = 7;

        int var1 = 0;
        while (var1 < matrizFila) {
            int var2 = 0;
            while (var2 < matrizColumna) {
                if (var1 == var2) {
                    matriz[var1][var2] = 1;
                } else {
                    matriz[var1][var2] = 0;
                }
                var2++;
            }
            var1++;
        }

        // Mostrar la matriz
        var1 = 0;
        while (var1 < matrizFila) {
            int var2 = 0;
            while (var2 < matrizColumna) {
                
                System.out.print(matriz[var1][var2] + " ");
                var2++;
            }
            System.out.println();
            var1++;
        }
    }
}
