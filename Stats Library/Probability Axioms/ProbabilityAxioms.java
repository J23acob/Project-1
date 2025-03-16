public class ProbabilityAxioms {

    // Method for independent intersection: P(A ∩ B) = P(A) * P(B)
    public double getIntersectionIndependent(double pA, double pB) {
        validateProbability(pA, "Probability of A");
        validateProbability(pB, "Probability of B");
        return pA * pB;
    }

    // Method for dependent intersection: P(A ∩ B) = P(A) * P(B|A)
    public double getIntersectionDependent(double pA, double pBgivenA) {
        validateProbability(pA, "Probability of A");
        validateProbability(pBgivenA, "Probability of B given A");
        return pA * pBgivenA;
    }

    // Method to compute the union of two events.
    // If events are mutually exclusive, then union = P(A) + P(B).
    // Otherwise, union = P(A) + P(B) - intersection.
    public double getUnion(double pA, double pB, double intersection, boolean isExclusive) {
        validateProbability(pA, "Probability of A");
        validateProbability(pB, "Probability of B");
        if (isExclusive) {
            return pA + pB;
        } else {
            validateProbability(intersection, "Intersection probability");
            return pA + pB - intersection;
        }
    }

    // Method to check if two events are independent.
    // Events are independent if P(A ∩ B) = P(A) * P(B).
    public boolean areIndependent(double pA, double pB, double pAandB) {
        validateProbability(pA, "Probability of A");
        validateProbability(pB, "Probability of B");
        validateProbability(pAandB, "Probability of A and B");
        double tolerance = 1e-10;
        return Math.abs(pA * pB - pAandB) < tolerance;
    }

    // Method to check if two events are dependent.
    // They are dependent if they are not independent.
    public boolean areDependent(double pA, double pB, double pAandB) {
        return !areIndependent(pA, pB, pAandB);
    }

    // Helper method to validate that a probability is between 0 and 1 (inclusive)
    private void validateProbability(double probability, String probabilityName) {
        if (probability < 0 || probability > 1) {
            throw new IllegalArgumentException(probabilityName + " must be between 0 and 1.");
        }
    }
}
