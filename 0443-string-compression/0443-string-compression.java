class Solution {
    public int compress(char[] chars) {
        int index = 0; // Index to update the result array.
        int i = 0; // Pointer for iterating through the array.

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count consecutive repeating characters.
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Update the result array.
            chars[index++] = currentChar;

            // If count is greater than 1, append the count to the result array.
            if (count > 1) {
                char[] countChars = Integer.toString(count).toCharArray();
                for (char c : countChars) {
                    chars[index++] = c;
                }
            }
        }

        return index; // Return the new length of the
    }
}