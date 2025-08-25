class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=1;
        for(int i:nums){
            if(max<i)max=i;
        }
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums){
            if(i>0)h.add(i);
        }
        for(int i=1;i<=max;i++){
            if(!h.contains(i))return i;
        }
        return max+1;
    }
}

//Leet Code: 41
// https://leetcode.com/problems/first-missing-positive/