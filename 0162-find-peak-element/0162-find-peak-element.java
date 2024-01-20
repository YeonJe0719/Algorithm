class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // The peak element must be in the left half (including mid)
                right = mid;
            } else {
                // The peak element must be in the right half (excluding mid)
                left = mid + 1;
            }
        }

        // At the end of the loop, left and right will be equal, pointing to the peak element
        return left;
    }
}