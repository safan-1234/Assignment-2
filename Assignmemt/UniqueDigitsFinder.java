package Assignmemt;


    import java.util.*;

public class UniqueDigitsFinder {
    public static List<Integer> findUniqueDigits(int[] numbers) {
        Set<Integer> uniqueDigits = new HashSet<>();

        // Extract digits from each number
        for (int num : numbers) {
            while (num > 0) {
                uniqueDigits.add(num % 10); // Extract the last digit
                num /= 10; // Remove the last digit
            }
        }

        // Convert to a sorted list
        List<Integer> sortedDigits = new ArrayList<>(uniqueDigits);
        Collections.sort(sortedDigits);
        
        return sortedDigits;
    }

    public static void main(String[] args) {
        int[] N = {111, 222, 333, 4444, 666};
        List<Integer> result = findUniqueDigits(N);

        // Print output
        System.out.println(result);
    }
}


