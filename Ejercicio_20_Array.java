public class Ejercicio_20_Array {
    public static void main(String[] args) {
        int[][] matriz_1 = {{5, 5, 5}, {10, 10, 10}, {15, 15, 15}};
        int[][] matriz_2 = {{15, 15, 15}, {20, 20, 20}, {5, 5, 5}};

        System.out.println("Primera Matriz :");
        enseñarMatriz(matriz_1);

        System.out.println("\n Segunda Matriz :");
        enseñarMatriz(matriz_2);

        int[][] suma = SumadeMatrices(matriz_1, matriz_2);

        System.out.println("\nSuma de las dos matrices son:");
        enseñarMatriz(suma);
    }

    // Segundo metodo
    public static void enseñarMatriz(int[][] sumaMatriz) {
        for (int var1 = 0; var1 < sumaMatriz.length; var1++) {
            for (int var2 = 0; var2 < sumaMatriz[var1].length; var2++) {
                System.out.print(sumaMatriz[var1][var2] + " ");
            }
            System.out.println();
        }
    }

    // tercer metodo
    public static int[][] SumadeMatrices(int[][] matriz1, int[][] matriz2) {
        int matrizFilas = matriz1.length;
        int matrizColumnas = matriz1[0].length;
        int[][] suma = new int[matrizFilas][matrizColumnas];

        for (int var1 = 0; var1 < matrizFilas; var1++) {
            for (int var2 = 0; var2 < matrizColumnas; var2++) {
                suma[var1][var2] = matriz1[var1][var2] + matriz2[var1][var2];
            }
        }

        return suma;
    }
}
