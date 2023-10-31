import java.util.Scanner;

public class Ejercicio_12_Array {
//primer metodo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arreglo de la Pokedex
        String[] arregloPokedex = {
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

        System.out.print("Escribe el nombre de un Pokémon: ");
        String Pokemon = sc.nextLine();

        // encontrar el pokemon en la pokedex(arreglo)
        int satoshi = buscarPokemon(Pokemon, arregloPokedex);

        if (satoshi != -1) {
            System.out.println("El Pokémon " + Pokemon + " se encuentra en el indice " + satoshi + " del array.");
        } else {
            System.out.println("El Pokémon " + Pokemon + " no se encontró en el arreglo de la pokedex.");
        }

        sc.close();
    }
//segundo metodo
    public static int buscarPokemon(String nombrepokemon, String[] arreglo) {
        for (int var = 0; var < arreglo.length; var++) {
            if (nombrepokemon.equalsIgnoreCase(arreglo[var])) {
                return var; 
            }
        }
        return -1;
    }
}
