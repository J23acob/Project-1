public class GameTester {
    public static void main(String[] args) {
        GameSimulation simulation = new GameSimulation();
        simulation.run();
    }
}

class GameSimulation {
    public void run() {
        Game game = new Game();
        simulate(game, false); // Play 10,000 times without switching
        simulate(game, true);  // Play 10,000 times with switching
    }

    private void simulate(Game game, boolean switchDoor) {
        int wins = 0;
        int trials = 10000;

        for (int i = 0; i < trials; i++) {
            if (game.playGame(switchDoor)) {
                wins++;
            }
        }

        double percentage = (wins * 100.0) / trials;
        System.out.println("Switching: " + switchDoor + " | Wins: " + wins + " | Win %: " + percentage + "%");
    }
}
