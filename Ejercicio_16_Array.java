public class Ejercicio_16_Array {
    public static void main(String[] args) {
        String[] nombresPokemon = {"Pikachu", "Charizard", "Bulbasaur", "Squirtle"};
        int[] poderesPokemon = {100, 150, 80, 90};

        int EncontrarPokemon = 0;
        int pokemonMasFuerte = poderesPokemon[0];

        int var = 1; 
        while (var < poderesPokemon.length) {
            if (poderesPokemon[var] > pokemonMasFuerte) {
                pokemonMasFuerte = poderesPokemon[var];
                EncontrarPokemon = var;
            }
            var++;
        }

        String PokemonPoderoso = nombresPokemon[EncontrarPokemon];
        System.out.println("El Pokémon mas fuerte y poderoso es: " + PokemonPoderoso);
    }
}
