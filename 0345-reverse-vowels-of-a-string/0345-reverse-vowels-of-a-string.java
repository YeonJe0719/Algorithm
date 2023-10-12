import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        char[] characters = s.toCharArray();
        List<Character> vowels = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        for(char c: characters){
            if(isVowel(c)){
                vowels.add(c);
            }
        }
        int i = vowels.size()-1;
        for(char c: characters){
            if(isVowel(c)){
                answer.append(vowels.get(i));
                i--;
            }else{
                answer.append(c);
            }
        }
        return answer.toString();
    }
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}