import java.util.Scanner;

public class Ejercicio_13_Array {

    public static void main(String[] args) {
        // Arreglo de los nombres de Pokémon
        String[] nombresPokemonB = {
            "Venusaur",
            "Blastoise",
            "Dragonite",
            "Gyarados",
            "Alakazam",
            "Arcanine",
            "Lapras",
            "Golem",
            "Gyarados",
            "Rhydon"
        };

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Escriba un número entre 0 y " + (nombresPokemonB.length - 1) + ": ");
        int var = sc.nextInt();

        if (var >= 0 && var < nombresPokemonB.length) {
            // Muestra el nombre del Pokémon en el índice dado
            String pokemon = nombresPokemonB[var];
            System.out.println("El Pokémon en la posicion " + var + " es: " + pokemon);
        } else {
            System.out.println("El índice está fuera de su posicion.");
        }

        sc.close();
    }
}

