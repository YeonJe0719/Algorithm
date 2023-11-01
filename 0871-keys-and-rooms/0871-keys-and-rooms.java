import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        while (!stack.isEmpty()) {
            int room = stack.pop();
            List<Integer> keys = rooms.get(room);
            for (int key : keys) {
                if (!visited.contains(key)) {
                    visited.add(key);
                    stack.push(key);
                }
            }
        }
        
        return visited.size() == rooms.size();
    }
}
