import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxOperations(int[] nums, int k) {
         Arrays.sort(nums);
        int count = 0;
        int lp = 0, rp = nums.length-1;
            while(lp < rp){
                if(nums[lp]+nums[rp] == k){
                    count++;
                    lp++;
                    rp--;
                }else if(nums[lp]+nums[rp] > k){
                    rp--;
                }else{
                    lp++;
                }
            }
        return count;
    }
}
