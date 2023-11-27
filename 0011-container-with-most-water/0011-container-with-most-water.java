class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int currentWidth = right - left;
            int currentHeight = Math.min(height[left], height[right]);

            maxWater = Math.max(maxWater, currentWidth * currentHeight);

            // Move pointers based on the smaller height to potentially find a larger height.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
