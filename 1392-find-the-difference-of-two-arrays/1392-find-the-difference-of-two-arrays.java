import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        Set<Integer> ans1 = new HashSet<>(set1);
        Set<Integer> ans2 = new HashSet<>(set2);

        ans1.removeAll(set2);
        ans2.removeAll(set1);

        return Arrays.asList(new ArrayList<>(ans1), new ArrayList<>(ans2));
    }
}
