public class TestProbabilityDistributions {
    public static void main(String[] args) {
        ProbabilityDistributions dist = new ProbabilityDistributions();

        // Test Binomial Distribution:
        // Example: n = 10 trials, k = 3 successes, p = 0.5 probability of success
        int n = 10;
        int k = 3;
        double pBinomial = 0.5;
        double binomialProb = dist.getBinomialProbability(n, k, pBinomial);
        System.out.println("Binomial Probability (n=" + n + ", k=" + k + ", p=" + pBinomial + "): " + binomialProb);

        // Test Geometric Distribution:
        // Example: k = 3 (first success on 3rd trial), p = 0.4 probability of success
        int trial = 3;
        double pGeometric = 0.4;
        double geometricProb = dist.getGeometricProbability(trial, pGeometric);
        System.out.println("Geometric Probability (k=" + trial + ", p=" + pGeometric + "): " + geometricProb);
    }
}
