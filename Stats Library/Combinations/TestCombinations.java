public class TestCombinations {
    public static void main(String[] args) {
        Combinations combinations = new Combinations();

        int n = 5;
        int r = 2;

        System.out.println("Combination (" + n + " choose " + r + "): " + combinations.getCombination(n, r));
        System.out.println("Permutation (" + n + " P " + r + "): " + combinations.getPermutation(n, r));
    }
}
