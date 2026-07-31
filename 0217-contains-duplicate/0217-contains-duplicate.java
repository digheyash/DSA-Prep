import java.util.* ;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false ;
        HashSet< Integer > map = new HashSet<>() ;
        for ( int num : nums){
            if (!map.add(num)) {
                return true;
            }
        }
       
        return flag ;

    }
}