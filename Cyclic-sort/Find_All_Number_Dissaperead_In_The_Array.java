class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int crct=nums[i]-1;
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
                arr.add(j+1);
            }
        }
        return arr;
    }
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

//Leet code:448
//Link : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/