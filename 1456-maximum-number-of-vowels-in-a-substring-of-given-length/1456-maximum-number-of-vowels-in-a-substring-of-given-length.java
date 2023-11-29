class Solution {
    public int maxVowels(String s, int k) {
        int result = 0;
        int currentCount = 0;
        
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                currentCount++;
            }
        }
        
        result = currentCount;
        
        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i-k))){
                currentCount--;
            }
            if(isVowel(s.charAt(i))){
                currentCount++;
            }
            result = Math.max(result,currentCount);
        }
        return result;
    }
    private static boolean isVowel(char ch){
        return "aeiou".indexOf(ch) != -1;
    }
}