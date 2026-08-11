import java.util.* ;
class SolutionfindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        // HashSet<Integer> hset = new HashSet<>() ;
        List<Integer> list = new ArrayList<>() ;
        for(int i=0 ; i< nums.length ;i++){
            int value = Math.abs(nums[i]) ;

            int index = value -1 ;
            if(nums[index]<0){
                list.add(value) ;
            }
            else{
                nums[index]=-nums[index] ;
            }
        }    
        // for (int i : nums){
        //     if(hset.add(i)){
        //         continue ;
        //     }
        //     else{
        //         list.add(i) ;
        //     }
        // }
        return list ;
    }
}