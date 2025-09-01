class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int b=target-nums[i];
            if(a.containsKey(b)&& a.get(b)!=i){
                return new int[]{i,a.get(b)};
            }
        }
        return new int[]{-1,-1};
    }
}

Leet Code:1
link :https://leetcode.com/problems/two-sum/description/