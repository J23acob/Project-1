public class StatsLibrary {

    // Method to calculate the mean of an integer array
    public double getMean(int[] numbers) {
        validateArray(numbers);
        
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Method to calculate the median of an integer array
    public double getMedian(int[] numbers) {
        validateArray(numbers);
        
        // Make a copy so we don't modify the original array
        int[] sorted = numbers.clone();
        java.util.Arrays.sort(sorted);

        int length = sorted.length;
        // If the length is even, median is the average of the two middle elements
        // If the length is odd, median is the middle element
        if (length % 2 == 0) {
            return (sorted[length / 2 - 1] + sorted[length / 2]) / 2.0;
        } else {
            return sorted[length / 2];
        }
    }

    // Method to calculate the mode (most frequent element) of an integer array
    // If there are multiple modes, it returns the first one encountered at the highest frequency
    public int getMode(int[] numbers) {
        validateArray(numbers);
        
        java.util.HashMap<Integer, Integer> frequencyMap = new java.util.HashMap<>();
        int mode = numbers[0];
        int maxCount = 0;
        
        for (int num : numbers) {
            // Update frequency
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            
            // Check if this is now the most frequent
            if (frequencyMap.get(num) > maxCount) {
                maxCount = frequencyMap.get(num);
                mode = num;
            }
        }
        return mode;
    }

    // Method to calculate the standard deviation of an integer array (population standard deviation)
    public double getStandardDeviation(int[] numbers) {
        validateArray(numbers);

        // First, find the mean
        double mean = getMean(numbers);

        // Sum up the squared differences from the mean
        double sumSquaredDiffs = 0;
        for (int num : numbers) {
            double diff = num - mean;
            sumSquaredDiffs += diff * diff;
        }

        // Population Standard Deviation = sqrt( (Σ(x - mean)^2 ) / n )
        return Math.sqrt(sumSquaredDiffs / numbers.length);
    }

    // Helper method to validate the array
    private void validateArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
    }
}
