class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        int num = 0;
        StringBuilder currentStr = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                numStack.push(num);
                strStack.push(currentStr);
                num = 0;
                currentStr = new StringBuilder();
            } else if (c == ']') {
                int repeatTimes = numStack.pop();
                StringBuilder prevStr = strStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    prevStr.append(currentStr);
                }
                currentStr = prevStr;
            } else {
                currentStr.append(c);
            }
        }

        return currentStr.toString();
    }
}