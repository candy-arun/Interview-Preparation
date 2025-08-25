class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int crct =nums[i]-1;
            if(nums[i]!=nums[crct]){
                swap(nums,i,crct);
            }
            else{
                i++;
            }
        }
        int[] arr=new int[2];
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                arr[0]=nums[j];
                arr[1]=j+1;
            }
        }
        return arr;
    }
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

//Leet Code :645
//Link : https://leetcode.com/problems/set-mismatch/