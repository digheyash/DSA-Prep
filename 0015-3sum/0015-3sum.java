import java.util.* ;

class Solution3sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result =new ArrayList <>() ;
        Arrays.sort(nums) ;
        for (int i = 0 ; i< nums.length -2 ; i++){
            if(i>0&&nums[i]==nums[i-1]){
               continue ;
            }
            int left = i+1 ;
            int right =nums.length-1 ;
            while(left < right){
                int sum =nums[i]+nums[left]+nums[right] ;
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right])) ;
                    while(left<right&&nums[left+1]==nums[left]){
                        left++ ;
                    }
                    while(left<right&&nums[right-1]==nums[right]){
                        right-- ;
                    }
                    left++ ;
                    right-- ;

                }
                else if (sum <0){
                    left++ ;
                }
                else{
                    right-- ;
                }    
                    
                
            }
        }
        return result ;
        //BruteForce :>
        // Set <List<Integer>> hset = new HashSet<>() ;
        // for(int i = 0 ; i< nums.length-2 ; i++){
        //     for(int j = i+1 ; j<nums.length-1 ; j++){
        //         for(int k = j+1 ; k<nums.length ; k++){
        //             if (nums[i]+nums[j]+nums[k] == 0){
        //                 List<Integer> temp = new ArrayList<>() ;
        //                 temp.add(nums[i]) ;
        //                 temp.add(nums[j]) ;
        //                 temp.add(nums[k]) ;
        //                 Collections.sort(temp) ;
        //                 hset.add(temp) ;
        //             }

        //         }
        //     }
        // }
        // return new ArrayList<>(hset) ;

    }
}