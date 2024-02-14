class Solution {
    public int findMinArrowShots(int[][] points) {
        PriorityQueue<pair> pq = new PriorityQueue<>(new Comparator<pair>() {
            public int compare(pair a, pair b) {
                if (a.end < b.end)
                    return -1;
                return 1;
            }
        });
        int n = points.length;
        for (int i = 0; i < n; i++) {
            pq.offer(new pair(points[i][0], points[i][1]));
        }
        int count = 1;
        pair t = pq.poll();
        int start = t.start;
        int end = t.end;
        while (!pq.isEmpty()) {
            pair temp = pq.poll();
            int x = temp.start;
            int y = temp.end;
            if (y <= end && y >= start) {

            } 
            else if (x > end) {
                count++;
                start = x;
                end = y;
            }
        }
        return count;
    }
class pair {
    int start;
    int end;
    pair(int start, int end) {
        this.start = start;
        this.end = end;
    }
 }
}