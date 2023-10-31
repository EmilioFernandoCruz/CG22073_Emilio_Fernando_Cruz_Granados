public class Ejercicio_6_Array {
    public static void main(String[] args) {
        // Arreglo de nombres de Pokémon
        String[] nombresPokemonA = {
        "1°A-Pikachu",
        "2°A-Charizard",
        "3°A-Bulbasaur",
        "4°A-Squirtle",
        "5°A-Jigglypuff",
        "6°A-Eevee",
        "7°A-Mewtwo",
        "8°A-Snorlax",
        "9°A-Gengar",
        "10°A-Machamp"};
        String[] nombresPokemonB = {
        "1°B-Venusaur",
        "2°B-Blastoise",
        "3°B-Dragonite",
        "4°B-Gyarados",
        "5°B-Alakazam",
        "6°B-Arcanine",
        "7°B-Lapras",
        "8°B-Golem",
        "9°B-Gyarados",
        "10°B-Rhydon"};
        
       
        int PokedexTotal = nombresPokemonA.length + nombresPokemonB.length;
        
        // Crear el tercer array para mezclar los nombres
        String[] nombresPokemonC = new String[PokedexTotal];
        
        int pokedexA = 0, pokedexB = 0;
        
        for (int pokebola = 0; pokebola < PokedexTotal; pokebola++) {
           
            if (pokebola % 2 == 0 && pokedexA < nombresPokemonA.length) {
                nombresPokemonC[pokebola] = nombresPokemonA[pokedexA];
                pokedexA++;
            } else if (pokedexB < nombresPokemonB.length) {
                nombresPokemonC[pokebola] = nombresPokemonB[pokedexB];
                pokedexB++;
            }
        }
        
        System.out.println("Nombres de Pokémon mezclados:");
        for (String nombresTotal : nombresPokemonC) {
            System.out.println(nombresTotal);
        }
    }
}

