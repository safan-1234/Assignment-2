package Assignmemt;


import java.util.Arrays;

public class assignment5 {
    


    public static int minCoins(int[] coins, int amount) {
        // Create a DP array filled with a large number (Infinity substitute)
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // Set to a large value
        dp[0] = 0; // No coins needed to make amount 0

        // Fill DP table
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If dp[amount] is still large, that means the amount can't be made
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println("Minimum coins required: " + minCoins(coins, amount));
    }
}


