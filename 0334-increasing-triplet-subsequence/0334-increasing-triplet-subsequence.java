class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= firstMin) {
                // Update the first minimum.
                firstMin = num;
            } else if (num <= secondMin) {
                // Update the second minimum.
                secondMin = num;
            } else {
                // Found a triplet.
                return true;
            }
        }

        // No triplet found.
        return false;
    }
}