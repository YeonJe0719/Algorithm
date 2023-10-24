import java.util.*;

class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (i > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
}
