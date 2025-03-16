public class TestVarianceAndIndependence {
    public static void main(String[] args) {
        VarianceAndIndependence analysis = new VarianceAndIndependence();

        // Test Variance:
        int[] numbers = {1, 2, 3, 4, 5};
        double variance = analysis.getVariance(numbers);
        System.out.println("Variance: " + variance);

        // Test Checking for Independence:
        // Example 1: Independent events: P(A)=0.5, P(B)=0.4, P(A and B)=0.2 (since 0.5*0.4=0.2)
        double pA1 = 0.5;
        double pB1 = 0.4;
        double pAandB1 = 0.2;
        System.out.println("Are events independent? " + analysis.areIndependent(pA1, pB1, pAandB1));

        // Example 2: Dependent events: P(A)=0.5, P(B)=0.4, P(A and B)=0.3 (since 0.5*0.4=0.2, not 0.3)
        double pA2 = 0.5;
        double pB2 = 0.4;
        double pAandB2 = 0.3;
        System.out.println("Are events independent? " + analysis.areIndependent(pA2, pB2, pAandB2));
    }
}
