import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        int overlapping = 0;
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                // Overlapping intervals found, need to remove one interval
                overlapping++;
                prevEnd = Math.min(prevEnd, intervals[i][1]); // Remove the one with larger end point
            } else {
                // Non-overlapping interval, update the previous end point
                prevEnd = intervals[i][1];
            }
        }

        return overlapping;
    }
}
