import java.util.Scanner;

public class Ejercicio_23_Array {

    static String[][] pokedex = {
        {"Pikachu", "90", "55", "40", "35"},
        {"Charizard", "100", "84", "78", "78"},
        {"Bulbasaur", "45", "49", "49", "45"},
        {"Squirtle", "43", "48", "65", "44"},
        {"Mewtwo", "130", "110", "90", "106"},
        {"Gengar", "110", "65", "60", "60"},
        {"Dragonite", "80", "134", "95", "91"},
        {"Snorlax", "30", "110", "65", "160"},
        {"Vaporeon", "65", "60", "95", "130"},
        {"Machamp", "55", "130", "80", "90"},
        {"Eevee", "55", "55", "50", "55"},
        {"Alakazam", "120", "50", "45", "55"},
        {"Lapras", "60", "85", "80", "130"},
        {"Gyarados", "81", "125", "79", "95"},
        {"Jigglypuff", "20", "45", "20", "115"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el nombre del Pokémon: ");
        String pokebola = scanner.nextLine();
        
        String[] estadisticasPokemon = buscarPokemon(pokebola);
        
        if (estadisticasPokemon != null) {
            enseñarEstadisticas(estadisticasPokemon);
        } else {
            System.out.println("El pokémon que buscas no se encuentra.");
        }
    }
    
    static String[] buscarPokemon(String mispokemons) {
        for (String[] pokemon : pokedex) {
            if (pokemon[0].equalsIgnoreCase(mispokemons)) {
                return pokemon;
            }
        }
        
        return null; 
    }
    
    static void enseñarEstadisticas(String[] estadisticaspokedex) {
        System.out.println("Estadísticas de " + estadisticaspokedex[0] + ":");
        System.out.println("Velocidad: " + estadisticaspokedex[1]);
        System.out.println("Ataque: " + estadisticaspokedex[2]);
        System.out.println("Defensa: " + estadisticaspokedex[3]);
        System.out.println("HP: " + estadisticaspokedex[4]);
        
    }
    
}

