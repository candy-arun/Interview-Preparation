class Solution {
    public int missingNumber(int[] nums) {
        int k=0;
        
        while(k<nums.length){
            int crct=nums[k];
            if(nums[k]<nums.length && nums[k]!=nums[crct]){
                swap(nums,k,crct);
            }
            else{
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i)return i;
        }
        return nums.length;
    }
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}


//Leet code: 268
//https://leetcode.com/problems/missing-number/