class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=0 ;
        int maxsum=Integer.MIN_VALUE ;
        
            for(int j=0 ;j<nums.length;j++){
                currentsum =currentsum+nums[j];
                maxsum=Math.max(maxsum,currentsum);

                if(currentsum<0){
                    currentsum=0;
                }
            }
        
        return maxsum ;
    }
}