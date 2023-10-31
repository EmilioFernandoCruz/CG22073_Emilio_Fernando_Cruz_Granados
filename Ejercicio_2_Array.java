import java.util.Scanner;

public class Ejercicio_2_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definir el tamaño del array
        int CantidadNum = 5;
        double[] num = new double[CantidadNum];

        // Leer los números por teclado y almacenarlos en el array
        for (int var = 0; var < CantidadNum; var++) {
            System.out.print("Escribe el número " + (var + 1) + ": ");
            num[var] = sc.nextDouble();
        }

        // Variables que ocupare en el codigo
        double SumarioPositivos = 0, SumarioNegativos = 0;
        int ContadorCeros = 0, PromedioPositivos = 0, PromedioNegativos = 0;

        //Hare la siguiente operacion para descubrir los numeros positivos negativos
        // y los ceros
        for (int var = 0; var < CantidadNum; var++) {
            if (num[var] > 0) {
                SumarioPositivos += num[var];
                PromedioPositivos++;
            } else if (num[var] < 0) {
                SumarioNegativos += num[var];
                PromedioNegativos++;
            } else {
                ContadorCeros++;
            }
        }

        // Mostrar los resultados de la media
        if (PromedioPositivos > 0) {
            double mediaPositivos = SumarioPositivos / PromedioPositivos;
            System.out.println("La Media de los números positivos que ingresastes son: " + mediaPositivos);
        } else {
            System.out.println("No se encontro números positivos.");
        }

        if (PromedioNegativos > 0) {
            double mediaNegativos = SumarioNegativos / PromedioNegativos;
            System.out.println("La Media de los números negativos que ingresastes son: " + mediaNegativos);
        } else {
            System.out.println("No se encontro números negativos.");
        }

        System.out.println("La Cantidad de ceros es: " + ContadorCeros);
    
       sc.close();
    }
    
}
