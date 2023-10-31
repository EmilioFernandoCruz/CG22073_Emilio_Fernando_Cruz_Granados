public class Ejercicio_14_Array {
//primer metodo
    public static void main(String[] args) {
        int[] numerosDesordenados = {64, 25, 12, 22, 11, 1, 77, 36, 98, 45};

        
        OrdenAscendente(numerosDesordenados);

        System.out.println("Orden ascendente:");
        MostrarArreglo(numerosDesordenados);

        OrdenDescendente(numerosDesordenados);

        System.out.println("Orden descendente:");
        MostrarArreglo(numerosDesordenados);
    }
//segundo metodo
    public static void OrdenAscendente(int[] arreglo) {
        int num = arreglo.length;
        boolean valor;
        do {
            valor = false;
            for (int var = 1; var < num; var++) {
                if (arreglo[var - 1] > arreglo[var]) {
                    int ordenAscendente = arreglo[var - 1];
                    arreglo[var - 1] = arreglo[var];
                    arreglo[var] = ordenAscendente;
                    valor = true;
                }
            }
        } while (valor);
    }
//tercer metodo
    public static void OrdenDescendente(int[] arreglo) {
        int num = arreglo.length;
        for (int var = 0; var < num - 1; var++) {
            int z = var;
            for (int i = var + 1; i < num; i++) {
                if (arreglo[i] > arreglo[z]) {
                    z = i;
                }
            }
            int OrdenDescendente = arreglo[var];
            arreglo[var] = arreglo[z];
            arreglo[z] = OrdenDescendente;
        }
    }

    public static void MostrarArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}

