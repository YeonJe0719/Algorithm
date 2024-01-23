class Solution {

static List<List<Integer>> ans;
    static void helper(int arr[], int idx, int k, int sum, List<Integer> a){
        if(k==0 && sum==0){
            System.out.println(a);
            ans.add(new ArrayList<>(a));
        }
        if(idx>=arr.length || k<=0 || sum<=0) return;
        a.add(arr[idx]);
        helper(arr,idx+1,k-1,sum-arr[idx],a);
        a.remove(a.size()-1);
        helper(arr,idx+1,k,sum,a);

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> a = new ArrayList<>();
        ans = new ArrayList<>();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        helper(arr,0,k,n,a);
        return ans;
    }
}