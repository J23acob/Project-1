public class TestProbabilityLibrary {
    public static void main(String[] args) {
        ProbabilityLibrary probability = new ProbabilityLibrary();

        // Example for Conditional Probability:
        // Let P(A and B) = 0.2 and P(B) = 0.5, then P(A|B) should be 0.2 / 0.5 = 0.4.
        double pAandB = 0.2;
        double pB = 0.5;
        System.out.println("Conditional Probability P(A|B): " + probability.getConditionalProbability(pAandB, pB));

        // Example for Bayes' Theorem:
        // Let P(B|A) = 0.7, P(A) = 0.3, and P(B) = 0.5,
        // then P(A|B) should be (0.7 * 0.3) / 0.5 = 0.42.
        double pBgivenA = 0.7;
        double pA = 0.3;
        double pB_forBayes = 0.5;
        System.out.println("Bayes Theorem P(A|B): " + probability.getBayesTheorem(pBgivenA, pA, pB_forBayes));
    }
}
