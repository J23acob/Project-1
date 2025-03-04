public class Combinations {

    // Method to calculate the combination (nCr)
    // Formula: nCr = n! / (r! * (n - r)!)
    public long getCombination(int n, int r) {
        validateInputs(n, r);
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Method to calculate the permutation (nPr)
    // Formula: nPr = n! / (n - r)!
    public long getPermutation(int n, int r) {
        validateInputs(n, r);
        return factorial(n) / factorial(n - r);
    }

    // Helper method to calculate factorial of a non-negative integer
    private long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Helper method to validate the inputs
    // Ensures that n and r are non-negative and that r does not exceed n
    private void validateInputs(int n, int r) {
        if (n < 0 || r < 0 || r > n) {
            throw new IllegalArgumentException("Invalid inputs: ensure n >= 0, r >= 0, and r <= n.");
        }
    }
}
