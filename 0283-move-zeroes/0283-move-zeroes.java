class Solution {
    public void moveZeroes(int[] nums) {
        int [] arr =new int[nums.length];
        int j=0 ;
        int end=nums.length-1 ;
        for(int i=0 ;i<nums.length; i++){
            if(nums[i]!=0){
                arr[j]=nums[i] ;
                j++;
            }
            if(nums[i]==0){
                arr[end]=0;
                end--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }
}