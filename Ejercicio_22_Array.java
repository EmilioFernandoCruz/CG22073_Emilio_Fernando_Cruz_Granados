public class Ejercicio_22_Array {
    public static void main(String[] args) {
        int matrizFilas = 8;
        int matrizColumnas = 6;
        int[][] matriz = marcoMatriz(matrizFilas, matrizColumnas);
        enseñarMatriz(matriz);
    }

    public static int[][] marcoMatriz(int marco1, int marco2) {
        int[][] matriz = new int[marco1][marco2];
        
        int var1 = 0; 
        while (var1 < marco1) {
            int var2 = 0; 
            while (var2 < marco2) {
                if (var1 == 0 || var1 == marco1 - 1 || var2 == 0 || var2 == marco2 - 1) {
                    matriz[var1][var2] = 1; 
                } else {
                    matriz[var1][var2] = 0; 
                }
                var2++;
            }
            var1++;
        }
        
        return matriz;
    }

    public static void enseñarMatriz(int[][] matriz8x6) {
        int var1 = 0; // Inicializamos la variable de control fuera del bucle
        while (var1 < matriz8x6.length) {
            int var2 = 0; // Inicializamos la variable de control dentro del bucle
            while (var2 < matriz8x6[0].length) {
                System.out.print(matriz8x6[var1][var2] + " ");
                var2++;
            }
            System.out.println(); 
            var1++;
        }
    }
}
