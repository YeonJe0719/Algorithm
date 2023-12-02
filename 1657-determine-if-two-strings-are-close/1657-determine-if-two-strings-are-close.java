class Solution {
    public boolean closeStrings(String word1, String word2) {
          if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        Map<Integer, Integer> countFreq1 = new HashMap<>();
        Map<Integer, Integer> countFreq2 = new HashMap<>();

        for (char ch : word1.toCharArray()) {
            freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word2.toCharArray()) {
            freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
        }

        for (int freq : freq1.values()) {
            countFreq1.put(freq, countFreq1.getOrDefault(freq, 0) + 1);
        }

        for (int freq : freq2.values()) {
            countFreq2.put(freq, countFreq2.getOrDefault(freq, 0) + 1);
        }

        return freq1.keySet().equals(freq2.keySet()) && countFreq1.equals(countFreq2);
    }
}