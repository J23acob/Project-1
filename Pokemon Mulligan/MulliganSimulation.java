import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MulliganSimulation {
    // Constants for deck size, hand size, and number of simulations per deck configuration
    public static final int DECK_SIZE = 60;
    public static final int HAND_SIZE = 7;
    public static final int SIMULATIONS = 10000;

    public static void main(String[] args) {
        System.out.println("PokemonCount,MulliganPercentage");
        
        // Loop through each possible number of Pokemon cards (from 1 to 60)
        for (int pokemonCount = 1; pokemonCount <= DECK_SIZE; pokemonCount++) {
            int energyCount = DECK_SIZE - pokemonCount;
            int mulliganCount = 0;
            
            // Run the simulation
            for (int i = 0; i < SIMULATIONS; i++) {
                // Build the deck
                List<String> deck = new ArrayList<>();
                for (int j = 0; j < pokemonCount; j++) {
                    deck.add("Pokemon");
                }
                for (int j = 0; j < energyCount; j++) {
                    deck.add("Energy");
                }
                
                // Shuffle the deck
                Collections.shuffle(deck);
                
                // Draw the top HAND_SIZE cards and check for a Pokémon card
                boolean hasPokemon = false;
                for (int k = 0; k < HAND_SIZE; k++) {
                    if (deck.get(k).equals("Pokemon")) {
                        hasPokemon = true;
                        break;
                    }
                }
                
                // If no Pokémon card is drawn, count it as a mulligan
                if (!hasPokemon) {
                    mulliganCount++;
                }
            }
            
            // Calculate the mulligan percentage
            double mulliganPercentage = (mulliganCount / (double) SIMULATIONS) * 100.0;
            System.out.println(pokemonCount + "," + mulliganPercentage);
        }
    }
}
