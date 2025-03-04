public class TestStatsLibrary {
    public static void main(String[] args) {
        StatsLibrary stats = new StatsLibrary();

        int[] numbers = {1, 2, 3, 3, 4, 5};

        System.out.println("Mean: " + stats.getMean(numbers));
        System.out.println("Median: " + stats.getMedian(numbers));
        System.out.println("Mode: " + stats.getMode(numbers));
        System.out.println("Standard Deviation: " + stats.getStandardDeviation(numbers));
    }
}
