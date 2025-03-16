public class TestProbabilityAxioms {
    public static void main(String[] args) {
        ProbabilityAxioms pa = new ProbabilityAxioms();

        // Test independent intersection: P(A)=0.5, P(B)=0.4 => Expected: 0.5 * 0.4 = 0.2
        double pA = 0.5;
        double pB = 0.4;
        double independentIntersection = pa.getIntersectionIndependent(pA, pB);
        System.out.println("Independent Intersection (P(A) * P(B)): " + independentIntersection);

        // Test dependent intersection: P(A)=0.5, P(B|A)=0.7 => Expected: 0.5 * 0.7 = 0.35
        double pBgivenA = 0.7;
        double dependentIntersection = pa.getIntersectionDependent(pA, pBgivenA);
        System.out.println("Dependent Intersection (P(A) * P(B|A)): " + dependentIntersection);

        // Test union for mutually exclusive events:
        // For mutually exclusive events, union = P(A) + P(B)
        double unionExclusive = pa.getUnion(0.3, 0.4, 0, true);
        System.out.println("Union of mutually exclusive events: " + unionExclusive);

        // Test union for non-exclusive events:
        // For non-exclusive events, assume intersection
        double unionNonExclusive = pa.getUnion(0.3, 0.4, 0.12, false);
        System.out.println("Union of non-exclusive events: " + unionNonExclusive);

        // Test independence check:
        // For independent events
        boolean independentCheck = pa.areIndependent(0.5, 0.4, 0.2);
        System.out.println("Are events independent? " + independentCheck);

        // Test dependency check:
        // For dependent events.
        boolean dependentCheck = pa.areDependent(0.5, 0.4, 0.3);
        System.out.println("Are events dependent? " + dependentCheck);
    }
}
