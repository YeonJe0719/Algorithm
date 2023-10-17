import java.util.*;
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int answer = 0;
        for(int l=0; l<k; l++){
            answer += nums[l];
        }
       
        for(int j=0; j<=nums.length-k; j++){
            int tmp = 0;
            for(int i=j; i<j+k; i++){
                tmp += nums[i];
            }
            if(tmp > answer){
                answer = tmp;
            } 
        }
        return (double)answer/k;
    }
}