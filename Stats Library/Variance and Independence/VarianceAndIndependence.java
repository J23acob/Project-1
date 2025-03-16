public class VarianceAndIndependence {

    // Method to calculate the variance of an integer array (population variance)
    public double getVariance(int[] numbers) {
        validateArray(numbers);
        double mean = getMean(numbers);
        double sumSquaredDiff = 0;
        for (int num : numbers) {
            double diff = num - mean;
            sumSquaredDiff += diff * diff;
        }
        return sumSquaredDiff / numbers.length;
    }

    // Method to check if two events are independent.
    // Two events A and B are independent if P(A and B) == P(A) * P(B) (within a small tolerance).
    public boolean areIndependent(double pA, double pB, double pAandB) {
        validateProbability(pA, "Probability of A");
        validateProbability(pB, "Probability of B");
        validateProbability(pAandB, "Probability of A and B");
        double product = pA * pB;
        // Using a tolerance to account for floating point precision
        double tolerance = 1e-10;
        return Math.abs(product - pAandB) < tolerance;
    }

    // Helper method to calculate the mean of an integer array
    private double getMean(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Helper method to validate the array is not null or empty
    private void validateArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
    }

    // Helper method to validate that a probability is between 0 and 1 (inclusive)
    private void validateProbability(double probability, String probabilityName) {
        if (probability < 0 || probability > 1) {
            throw new IllegalArgumentException(probabilityName + " must be between 0 and 1.");
        }
    }
}
