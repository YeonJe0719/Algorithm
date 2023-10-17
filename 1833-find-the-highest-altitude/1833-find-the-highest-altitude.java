import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        int[] alts = new int[gain.length+1];
        alts[0] = 0;
        for(int i=1; i<alts.length; i++){
            alts[i] = alts[i-1] + gain[i-1];
        }
        Arrays.sort(alts);
        return alts[alts.length-1];
    }
}