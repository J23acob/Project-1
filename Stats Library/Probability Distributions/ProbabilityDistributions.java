public class ProbabilityDistributions {

    // Method to calculate the binomial probability
    // Formula: P(X = k) = nCk * p^k * (1 - p)^(n - k)
    public double getBinomialProbability(int n, int k, double p) {
        validateBinomialInputs(n, k, p);
        long combination = getCombination(n, k);
        return combination * Math.pow(p, k) * Math.pow(1 - p, n - k);
    }

    // Method to calculate the geometric probability
    // Formula: P(X = k) = p * (1 - p)^(k - 1), where k >= 1
    public double getGeometricProbability(int k, double p) {
        validateGeometricInputs(k, p);
        return p * Math.pow(1 - p, k - 1);
    }

    // Helper method to calculate nCk (combination) using factorials
    private long getCombination(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // Helper method to calculate factorial of a non-negative integer
    private long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Validate inputs for the binomial probability calculation
    private void validateBinomialInputs(int n, int k, double p) {
        if (n < 0) {
            throw new IllegalArgumentException("Number of trials (n) must be non-negative.");
        }
        if (k < 0 || k > n) {
            throw new IllegalArgumentException("Number of successes (k) must be between 0 and n.");
        }
        if (p < 0 || p > 1) {
            throw new IllegalArgumentException("Probability (p) must be between 0 and 1.");
        }
    }

    // Validate inputs for the geometric probability calculation
    private void validateGeometricInputs(int k, double p) {
        if (k < 1) {
            throw new IllegalArgumentException("Trial number (k) must be at least 1.");
        }
        if (p <= 0 || p > 1) {
            throw new IllegalArgumentException("Probability (p) must be greater than 0 and at most 1.");
        }
    }
}
