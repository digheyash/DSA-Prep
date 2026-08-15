class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        HashSet<Integer> count =new HashSet<>() ;
        int countno = 0 ;
        int max=0 ;
        for(int i=0 ;i<nums.length ; i++){
            if(nums[i]==1){
                countno++ ;
            }
            if(nums[i]==0||i==nums.length-1){
                count.add(countno) ;
                countno=0 ;
            }
        }
        for(int i: count){
            max=Math.max(i,max);
        }
        return max ;
    }
}