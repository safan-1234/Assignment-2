package Assignmemt;
    import java.util.Arrays;

public class PostfixSumCalculator {
    public static int[] computePostfixSum(int[] fuel) {
        int m = fuel.length;
        int[] postfixSum = new int[m];

        // Initialize the last element
        postfixSum[m - 1] = fuel[m - 1];

        // Compute postfix sum from right to left
        for (int i = m - 2; i >= 0; i--) {
            postfixSum[i] = postfixSum[i + 1] + fuel[i];
        }

        return postfixSum;
    }

    public static void main(String[] args) {
        int[] fuel = {5, 10, 3, 7, 8};
        int[] postfixSum = computePostfixSum(fuel);

        // Print output
        System.out.println("PostfixSum[] = " + Arrays.toString(postfixSum));
    }
}


