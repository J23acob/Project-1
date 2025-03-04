public class ProbabilityLibrary {

    // Method to calculate conditional probability P(A|B) = P(A and B) / P(B)
    public double getConditionalProbability(double pAandB, double pB) {
        validateProbability(pAandB, "Probability of A and B");
        validateProbability(pB, "Probability of B");
        if (pB == 0) {
            throw new IllegalArgumentException("Probability of B must be greater than 0.");
        }
        return pAandB / pB;
    }

    // Method to calculate probability using Bayes' Theorem: P(A|B) = (P(B|A) * P(A)) / P(B)
    public double getBayesTheorem(double pBgivenA, double pA, double pB) {
        validateProbability(pBgivenA, "Probability of B given A");
        validateProbability(pA, "Probability of A");
        validateProbability(pB, "Probability of B");
        if (pB == 0) {
            throw new IllegalArgumentException("Probability of B must be greater than 0.");
        }
        return (pBgivenA * pA) / pB;
    }

    // Helper method to validate that a probability is between 0 and 1 (inclusive)
    private void validateProbability(double probability, String probabilityName) {
        if (probability < 0 || probability > 1) {
            throw new IllegalArgumentException(probabilityName + " must be between 0 and 1.");
        }
    }
}
