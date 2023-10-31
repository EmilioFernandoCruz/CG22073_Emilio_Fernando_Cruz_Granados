public class Ejercicio_19_Array {

    public static void main(String[] args) {
        int[][] tabla4x4 = {
            {1, 2, 3, 4},
            {2, 5, 6, 7},
            {3, 6, 8, 9},
            {4, 7, 9, 10}
        };

        boolean tablaSimetrica = SiesSimetrica(tabla4x4);

        if (tablaSimetrica) {
            System.out.println("Su tabla es Simétrica.");
        } else {
            System.out.println("Su tabla NO es Simétrica.");
        }
    }

    //    Encuentra si una matriz de N x M está simétrica o no. Una matriz se considerará sim
    public static boolean SiesSimetrica(int[][] matriz) {
        int TablaFilas = matriz.length;
        int TablaColumnas = matriz[0].length;

        if (TablaFilas != TablaColumnas) {
            return false;
        }

        // Comparamos la tabla con su transpuesta
        for (int var1 = 0; var1 < TablaFilas; var1++) {
            for (int var2 = 0; var2 < TablaColumnas; var2++) {
                if (matriz[var1][var2] != matriz[var2][var1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
