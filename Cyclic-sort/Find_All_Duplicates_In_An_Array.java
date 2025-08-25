class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> arr=new ArrayList<>();
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                arr.add(nums[j]);
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

//Leet Code: 442
// Link : https://leetcode.com/problems/find-all-duplicates-in-an-array/