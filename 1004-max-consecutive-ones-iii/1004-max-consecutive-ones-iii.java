class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0; // left pointer of the window
        int maxConsecutiveOnes = 0; // maximum consecutive ones in the current window
        int zeroCount = 0; // count of zeros in the current window

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            // If the number of zeros in the current window exceeds k, move the left pointer to the right
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update the maximum consecutive ones in the current window
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, right - left + 1);
        }

        return maxConsecutiveOnes;
    }
}
