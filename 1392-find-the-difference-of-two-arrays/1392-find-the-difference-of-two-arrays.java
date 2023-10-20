import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> ans1 = new HashSet<>();
        Set<Integer> ans2 = new HashSet<>();
        List<Integer> tmp1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> tmp2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        for (int i = 0; i < nums1.length; i++) {
            if (!tmp2.contains(nums1[i]))
                ans1.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (!tmp1.contains(nums2[j]))
                ans2.add(nums2[j]);
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(ans1));
        answer.add(new ArrayList<>(ans2));

        return answer;
    }
}
