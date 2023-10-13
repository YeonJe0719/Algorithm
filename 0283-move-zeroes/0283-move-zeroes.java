class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int n : nums) {
            numList.add(n);
        }

        numList.removeIf(n -> n == 0); // 0을 제거

        while (numList.size() < nums.length) {
            numList.add(0); // 0을 리스트 뒤에 추가
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = numList.get(i);
        }
    }
}
