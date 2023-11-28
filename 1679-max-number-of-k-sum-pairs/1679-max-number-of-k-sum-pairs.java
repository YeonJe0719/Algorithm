import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxOperations(int[] nums, int k) {
          int maxOperations = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number in the array
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the array and perform operations
        for (int num : nums) {
            int complement = k - num;

            // Check if the complement is present in the map and its frequency is positive
            if (frequencyMap.getOrDefault(complement, 0) > 0) {
                maxOperations++;
                frequencyMap.put(complement, frequencyMap.get(complement) - 1);
            }
        }

        return maxOperations / 2;
    }
}
