public class Ejercicio_21_Array {
    public static void main(String[] args) {
        int[] arreglo = {20, 15, 10, 5, 1};
        System.out.println("Arreglo original:");
        enseñarArray(arreglo);

        invertirArray(arreglo);

        System.out.println("\nArreglo invertido:");
        enseñarArray(arreglo);
    }

    // Segundo metodo con while
    public static void invertirArray(int[] arreglo) {
        int arrInicio = 0;
        int arrFin = arreglo.length - 1;

        while (arrInicio < arrFin) {
            int temp = arreglo[arrInicio];
            arreglo[arrInicio] = arreglo[arrFin];
            arreglo[arrFin] = temp;

            arrInicio++;
            arrFin--;
        }
    }

   //Tercer metodo
    public static void enseñarArray(int[] arreglo) {
        for (int var = 0; var < arreglo.length; var++) {
            System.out.print(arreglo[var] + " ");
        }
    }
}
