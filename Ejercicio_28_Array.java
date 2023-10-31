import java.util.Scanner;

public class Ejercicio_28_Array {

    static int TotaldeEstudiantes;
    static int cantPeriodos;
    static Double[][] calificaciones;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DatosIniciales(scanner);

        calificaciones = new Double[TotaldeEstudiantes][cantPeriodos];

        // Menú de Opciones
        int opcion;
        do {
            System.out.println("\nMenu de Opciones:");
            System.out.println("1. Escribe calificaciones por período.");
            System.out.println("2. Escribe las calificaciones por estudiante.");
            System.out.println("3. Ver calificaciones.");
            System.out.println("4. Salir.");
            System.out.print("Ingrese su opción (1-4): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarCalificacionesPorPeriodo(scanner);
                    break;
                case 2:
                    ingresarCalificacionesPorEstudiante(scanner);
                    break;
                case 3:
                    verCalificaciones();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println(" Elija una opcion correcta entre el 1 al 4.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }

    static void DatosIniciales(Scanner scanner) {
        do {
            System.out.print("Escribe el total de estudiantes (entre 1 y 10): ");
            TotaldeEstudiantes = scanner.nextInt();
        } while (TotaldeEstudiantes < 1 || TotaldeEstudiantes > 10);

        do {
            System.out.print("Escribe la cantidad de períodos académicos (entre 3 y 5): ");
            cantPeriodos = scanner.nextInt();
        } while (cantPeriodos < 3 || cantPeriodos > 5);
    }

    static void ingresarCalificacionesPorPeriodo(Scanner scanner) {
        System.out.print("Escribe el número de período (entre 1 y " + cantPeriodos + "): ");
        int periodo = scanner.nextInt();

        while (periodo < 1 || periodo > cantPeriodos) {
            System.out.println("Hazlo de nuevo, por favor.");
            System.out.print("Escribe el número de período (entre 1 y " + cantPeriodos + "): ");
            periodo = scanner.nextInt();
        }

        System.out.println("Escribe las calificaciones para el período " + periodo + ":");
        for (int var = 0; var < TotaldeEstudiantes; var++) {
            System.out.print("Estudiante " + (var + 1) + ": ");
            Double calificacion = scanner.nextDouble();

            while (calificacion < 0 || calificacion > 10) {
                System.out.println("Calificación Inválida.");
                System.out.print("Estudiante " + (var + 1) + ": ");
                calificacion = scanner.nextDouble();
            }

            calificaciones[var][periodo - 1] = calificacion;
        }
    }

    static void ingresarCalificacionesPorEstudiante(Scanner scanner) {
        System.out.print("Escribe el número de estudiante (entre 1 y " + TotaldeEstudiantes + "): ");
        int estudiante = scanner.nextInt();

        while (estudiante < 1 || estudiante > TotaldeEstudiantes) {
            System.out.println(" Intentelo de nuevo, te has equivocado.");
            System.out.print("Escribe el número de estudiante (entre 1 y " + TotaldeEstudiantes + "): ");
            estudiante = scanner.nextInt();
        }

        System.out.print("Escribe el número de período (entre 1 y " + cantPeriodos + "): ");
        int periodo = scanner.nextInt();

        while (periodo < 1 || periodo > cantPeriodos) {
            System.out.println(" Intentelo de nuevo.");
            System.out.print("Escribe el número de período (entre 1 y " + cantPeriodos + "): ");
            periodo = scanner.nextInt();
        }

        System.out.print("Escribe la calificación para el estudiante " + estudiante + " y período " + periodo + ": ");
        Double calificacion = scanner.nextDouble();

        while (calificacion < 0 || calificacion > 10) {
            System.out.println("Calificación no válida. Intentelo de nuevo.");
            System.out.print("Escribe la calificación para el estudiante " + estudiante + " y período " + periodo + ": ");
            calificacion = scanner.nextDouble();
        }

        calificaciones[estudiante - 1][periodo - 1] = calificacion;
    }

    static void verCalificaciones() {
        System.out.println("\nCalificaciones:");

    
        System.out.print("Estudiante |");
        for (int var = 1; var <= cantPeriodos; var++) {
            System.out.print(" Periodo " + var + " |");
        }
        System.out.println();

        for (int var1 = 0; var1 < TotaldeEstudiantes; var1++) {
            System.out.print("     " + (var1 + 1) + "     |");
            for (int var2 = 0; var2 < cantPeriodos; var2++) {
                System.out.printf("    %.1f   |", calificaciones[var1][var2]);
            }
            System.out.println();
        }
    }
}
