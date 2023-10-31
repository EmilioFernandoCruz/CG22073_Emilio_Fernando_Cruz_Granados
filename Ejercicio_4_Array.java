import java.util.Scanner;

public class Ejercicio_4_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int CantidadPokemon = 5;
        String[] Pokedex = new String[CantidadPokemon];

        int satoshi = 0; 
        while (satoshi < CantidadPokemon) {
            System.out.print("Escribe el nombre del Pokémon " + (satoshi + 1) + ": ");
            Pokedex[satoshi] = sc.nextLine();
            satoshi++;
        }
        
        System.out.println("Nombres de los Pokémon al reves:");
        satoshi = CantidadPokemon - 1; 
        while (satoshi >= 0) {
            System.out.println(Pokedex[satoshi]);
            satoshi--;
        }

        sc.close();
    }
}
