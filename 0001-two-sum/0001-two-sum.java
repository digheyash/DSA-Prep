class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int [] arr =new int[2];
        HashMap<Integer ,Integer> hmap = new HashMap<>() ;
        for (int i = 0 ; i< nums.length ;i++){
            int compliment = target - nums[i] ;
            if(hmap.containsKey(compliment)){
                return new int [] {hmap.get(compliment), i } ;
                // arr[0] = i ;
                // arr[1] = hmap.get(compliment) ;
            }
            else{
                hmap.put(nums[i],i) ;
            }
        }

        // for(int i=0 ;i<nums.length;i++){
        //     for(int j =(i+1);j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             arr [0]=i;
        //             arr [1] =j;
                    
        //         }
        //     }
           
        // }
        return new int []{};
    }
}