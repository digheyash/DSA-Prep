class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int countno = 0 ;
        int max=0 ;
        for(int i=0 ;i<nums.length ; i++){
            if(nums[i]==1){
                countno++ ;
            }
            if(nums[i]==0||i==nums.length-1){
                 max=Math.max(countno,max);
                countno=0 ;
            }
        }
        
        return max ;
    }
}