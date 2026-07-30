class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false ;
        HashMap< Integer , Integer > map = new HashMap<>() ;
        for ( int num : nums){
            map.put(num,map.getOrDefault(num , 0)+1);
        }
        for (int no : map.keySet()){
            if (map.get(no) > 1){
                flag = true ;
                break ;
            }
        }
        return flag ;

    }
}