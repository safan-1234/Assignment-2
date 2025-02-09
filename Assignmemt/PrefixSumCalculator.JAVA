import java.util.Arrays;

public class PrefixSumCalculator {
    public static int[] computePrefixSum(int[] sales) {
        int n = sales.length;
        int[] prefixSum = new int[n];
        
        // Initialize the first element
        prefixSum[0] = sales[0];
        
        // Compute prefix sum
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + sales[i];
        }
        
        return prefixSum;
    }

    public static void main(String[] args) {
        int[] sales = {10, 20, 15, 30, 25};
        int[] prefixSum = computePrefixSum(sales);
        
        // Print output
        System.out.println("PrefixSum[] = " + Arrays.toString(prefixSum));
    }
}
