import java.util.ArrayList;

public class SetOperations {

    // Method to perform the union of two ArrayLists (without duplicates)
    public ArrayList<String> union(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> result = new ArrayList<>();
        // Add all elements from the first list
        for (String item : list1) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        // Add elements from the second list if not already present
        for (String item : list2) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // Method to perform the intersection of two ArrayLists
    public ArrayList<String> intersection(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> result = new ArrayList<>();
        for (String item : list1) {
            if (list2.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // Method to return the complement of a subset relative to the universal set.
    // The complement consists of all elements in the universal set that are not in the subset.
    public ArrayList<String> complement(ArrayList<String> universal, ArrayList<String> subset) {
        ArrayList<String> result = new ArrayList<>();
        for (String item : universal) {
            if (!subset.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
