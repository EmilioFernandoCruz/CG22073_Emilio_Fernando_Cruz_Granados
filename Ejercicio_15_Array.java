import java.util.Scanner;

public class Ejercicio_15_Array {

    public static void main(String[] args) {
        String[] nombresPokemon = {"pikachu", "charizard", "bulbasaur", "squirtle", "jigglypuff"};
        int[] poderesPokemon = {100, 150, 80, 90, 120};

        Scanner sc = new Scanner(System.in);

        //Nombres de los pokemones
        System.out.print("Escribe el nombre de un Pokémon: ");
        String pokemon = sc.nextLine().toLowerCase();

        // Busca el nombre del Pokémon en el arreglo
        int pokebola = -1;
        int var = 0; // Inicializamos la variable de control fuera del bucle
        while (var < nombresPokemon.length) {
            if (nombresPokemon[var].equals(pokemon)) {
                pokebola = var;
                break;
            }
            var++;
        }

        if (pokebola != -1) {
            System.out.print("Escribe la nueva cantidad de poder para " + pokemon + ": ");
            int evoluciondePoder = sc.nextInt();

            poderesPokemon[pokebola] = evoluciondePoder;

            System.out.println("Nombres de los Pokémon:");
            int kanto = 0; // Inicializamos la variable de control fuera del bucle
            while (kanto < nombresPokemon.length) {
                System.out.println(nombresPokemon[kanto]);
                kanto++;
            }

            System.out.println("Poderes de los Pokémon:");
            int polvodeEstrellas = 0; // Inicializamos la variable de control fuera del bucle
            while (polvodeEstrellas < poderesPokemon.length) {
                System.out.println(poderesPokemon[polvodeEstrellas]);
                polvodeEstrellas++;
            }
        } else {
            System.out.println("El Pokémon que buscas no se encuentra en el arreglo.");
        }

        sc.close();
    }
}

