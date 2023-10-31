import java.util.Scanner;

public class Ejercicio_27_array {

    static char[][] tablero = new char[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        iniciarJuego();

        char jugador = 'X';

        boolean juegoEnCurso = true, empate = false;

        while (juegoEnCurso && !empate) {
            mostrarTablero();
            System.out.println("Es turno del Jugador " + jugador);

            int fila, columna;
            do {
                System.out.print("Ingresa la fila (0, 1, 2): ");
                fila = scanner.nextInt();
                System.out.print("Ingresa la columna (0, 1, 2): ");
                columna = scanner.nextInt();
            } while (!esMovimientoValido(fila, columna));

            tablero[fila][columna] = jugador;

            if (esGanador(jugador)) {
                mostrarTablero();
                System.out.println("¡Jugador " + jugador + " HAS GANADO!, !Felicidades¡");
                juegoEnCurso = false;
            } else if (esEmpate()) {
                mostrarTablero();
                System.out.println("¡El juego terminó en empate!, ¡Reinicia el juego!");
                empate = true;
            }

            jugador = (jugador == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    static void iniciarJuego() {
        for (char[] fila : tablero) {
            for (int i = 0; i < fila.length; i++) {
                fila[i] = ' ';
            }
        }
    }

    static void mostrarTablero() {
        System.out.println("Tablero:");
        for (char[] fila : tablero) {
            for (char c : fila) {
                System.out.print(c + " | ");
            }
            System.out.println();
        }
    }

    static boolean esMovimientoValido(int fila, int columna) {
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ') {
            System.out.println("Movimiento Inválido. Inténtalo de nuevo, por favor.");
            return false;
        }
        return true;
    }

    static boolean esGanador(char jugador) {
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }
        return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
                (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
    }

    static boolean esEmpate() {
        for (char[] fila : tablero) {
            for (char c : fila) {
                if (c == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
