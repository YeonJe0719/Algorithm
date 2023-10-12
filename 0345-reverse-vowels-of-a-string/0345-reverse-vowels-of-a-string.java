class Solution {
    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder(s);
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (isVowel(leftChar) && isVowel(rightChar)) {
                // 두 문자가 모음이면 위치를 교체
                result.setCharAt(left, rightChar);
                result.setCharAt(right, leftChar);
                left++;
                right--;
            } else if (isVowel(leftChar)) {
                // 오른쪽 문자가 모음이 아닌 경우
                right--;
            } else if (isVowel(rightChar)) {
                // 왼쪽 문자가 모음이 아닌 경우
                left++;
            } else {
                // 양쪽 모두 모음이 아닌 경우
                left++;
                right--;
            }
        }

        return result.toString();
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
