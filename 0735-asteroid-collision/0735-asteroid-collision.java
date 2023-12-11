class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                // If the asteroid is moving to the right, push it onto the stack.
                stack.push(asteroid);
            } else {
                // If the asteroid is moving to the left, handle collisions.
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    // The asteroid in the stack will explode.
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    // The asteroid moving to the left survives or there is no asteroid moving to the right.
                    stack.push(asteroid);
                } else if (stack.peek() == Math.abs(asteroid)) {
                    // Both asteroids explode.
                    stack.pop();
                }
            }
        }

        // Convert the stack to an array.
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}