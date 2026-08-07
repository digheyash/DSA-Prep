class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i =0 ;i< nums.length ; i++){
           if(nums[i]<=0||nums[i]>nums.length){
            nums[i]=nums.length+1 ;
           }
        }
        for(int i =0 ;i< nums.length ;i++){
            int value = Math.abs(nums[i]);
            if(value<nums.length+1){
                nums[value-1]=-Math.abs(nums[value-1]);
            }
        }
        for(int i =0 ;i< nums.length ;i++){
            if(nums[i] > 0){
                return i+1 ;
            }
        }
        return nums.length+1 ;
    }
}