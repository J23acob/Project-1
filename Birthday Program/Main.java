import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number of people in the class.
        System.out.print("Enter number of people in the class: ");
        int numPeople = scanner.nextInt();
        
        // Get user input for the number of simulation runs.
        System.out.print("Enter number of simulation runs: ");
        int runs = scanner.nextInt();
        
        // Call the simulation. The main method handles object construction and method calling,
        // keeping the simulation logic separate.
        BirthdaySimulation.runSimulation(numPeople, runs);
        
        scanner.close();
    }
}
