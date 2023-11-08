import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        String[] phoneMapping = new String[] {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        generateCombinations(result, digits, phoneMapping, 0, "");
        return result;
    }

    private void generateCombinations(List<String> result, String digits, String[] phoneMapping, int index, String current) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        char digit = digits.charAt(index);
        String letters = phoneMapping[digit - '0'];

        for (char letter : letters.toCharArray()) {
            generateCombinations(result, digits, phoneMapping, index + 1, current + letter);
        }
    }
}
