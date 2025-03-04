import java.util.*;

public class BirthdaySimulation {

    // This method checks if any two people in the list share the same birthday.
    public static boolean hasSharedBirthday(List<Person> people) {
        Set<Integer> birthdaySet = new HashSet<>();
        for (Person p : people) {
            // If the birthday is already in the set, we have a duplicate.
            if (birthdaySet.contains(p.getBirthday())) {
                return true;
            }
            birthdaySet.add(p.getBirthday());
        }
        return false;
    }
    
    // Runs the simulation for a given number of people and runs.
    public static void runSimulation(int numPeople, int runs) {
        int countSharedBirthday = 0;
        Random random = new Random();
        
        for (int i = 0; i < runs; i++) {
            List<Person> people = new ArrayList<>();
            // Create a list of people with random birthdays.
            for (int j = 0; j < numPeople; j++) {
                // Generate a random birthday between 1 and 365 (MM/DD simplified as day of year).
                int birthday = random.nextInt(365) + 1;
                people.add(new Person(birthday));
            }
            if (hasSharedBirthday(people)) {
                countSharedBirthday++;
            }
        }
        
        double probability = (double) countSharedBirthday / runs;
        System.out.println("In a class of " + numPeople + " people, the probability of at least two sharing a birthday is " + probability);
    }
}
