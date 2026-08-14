class Solution {
    public boolean check(int[] nums) {
         int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }

            if (count > 1) {
                return false;
            }
        }

        return true;
        // boolean result =true ;

        // for(int i=0 ;i<nums.length-1 ;i++){
        //     if(nums[i+1]<nums[i]){
        //         nums=reverse(0 ,nums.length-1,nums) ;
        //         nums=reverse(0 ,nums.length-2-i,nums) ;
        //         nums=reverse(nums.length-1-i,nums.length-1,nums) ;
        //         result=sortedornot(nums);
        //         return result ;
        //     }
            
        // }
        // return result ;
    }
    private int[] reverse(int st ,int end ,int [] arr){
        int [] reverse =arr.clone() ;
        for(int i=end , j=st ;i>=st &&j<=end ;i--,j++){
            reverse[j]=arr[i] ;
        }
        
        return reverse ;
    }

    private boolean sortedornot (int[]arr){
        for(int i=0 ;i<arr.length-1 ;i++){
            if(arr[i+1]<arr[i]){
               return false ;
            }
            
        }
        return true ;
    }
}