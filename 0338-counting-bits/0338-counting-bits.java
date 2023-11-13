class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i <= n; i++){
            String binaryString = Integer.toBinaryString(i);
            int countOnes = countOnes(binaryString);
            ans[i] = countOnes;
            // ans[i] = Integer.bitCount(i);
        }
        return ans;
    }

    private static int countOnes(String binaryString) {
    int count = 0;
    for (char c : binaryString.toCharArray()) {
        if (c == '1') {
            count++;
        }
    }
    return count;
}
}