import java.util.ArrayList;
import java.util.Arrays;

public class TestSetOperations {
    public static void main(String[] args) {
        SetOperations ops = new SetOperations();

        // Define the universal set: days of the week
        ArrayList<String> universal = new ArrayList<>(Arrays.asList(
            "Monday", "Tuesday", "Wednesday", "Thursday", "FRIDAY!!", "Saturday", "Sunday"
        ));

        // Define subset A: weekdays
        ArrayList<String> weekdays = new ArrayList<>(Arrays.asList(
            "Monday", "Tuesday", "Wednesday", "Thursday", "FRIDAY!!"
        ));

        // Define subset B: weekend
        ArrayList<String> weekend = new ArrayList<>(Arrays.asList(
            "Saturday", "Sunday"
        ));

        // Union of weekdays and weekend (should equal the universal set)
        ArrayList<String> unionResult = ops.union(weekdays, weekend);
        System.out.println("Union of weekdays and weekend: " + unionResult);

        // Intersection of weekdays and weekend (should be empty)
        ArrayList<String> intersectionResult = ops.intersection(weekdays, weekend);
        System.out.println("Intersection of weekdays and weekend: " + intersectionResult);

        // Complement of weekdays relative to the universal set (should give the weekend)
        ArrayList<String> complementResult = ops.complement(universal, weekdays);
        System.out.println("Complement of weekdays in the universal set: " + complementResult);
    }
}
