import java.util.ArrayList;

public class Ejercicio_24_Array {

    public static void main(String[] args) {
        int[] arregloOriginal = {1, 2, 2, 3, 4, 4, 5};
        int[] arraySinDuplicados = quitarDuplicados(arregloOriginal);
        
        System.out.println("Mostrar Arreglo original:");
        enseñarArray(arregloOriginal);
        
        System.out.println("Mostrar Arreglo sin duplicados:");
        enseñarArray(arraySinDuplicados);
    }

    static int[] quitarDuplicados(int[] arreglo) {
        ArrayList<Integer> SinDuplicados = new ArrayList<>();
        
        int i = 0; 
        while (i < arreglo.length) {
            int valor = arreglo[i];
            if (!SinDuplicados.contains(valor)) {
                SinDuplicados.add(valor);
            }
            i++;
        }
        
        int[] respuesta = new int[SinDuplicados.size()];
        int var = 0; 
        while (var < SinDuplicados.size()) {
            respuesta[var] = SinDuplicados.get(var);
            var++;
        }
        
        return respuesta;
    }
    
    static void enseñarArray(int[] arreglo) {
        int var = 0; 
        while (var < arreglo.length) {
            System.out.print(arreglo[var] + " ");
            var++;
        }
        System.out.println();
    }
}
