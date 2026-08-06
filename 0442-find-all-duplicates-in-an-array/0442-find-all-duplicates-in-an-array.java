class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hset = new HashSet<>() ;
        List<Integer> list = new ArrayList<>() ;
        for (int i : nums){
            if(hset.add(i)){
                continue ;
            }
            else{
                list.add(i) ;
            }
        }
        return list ;
    }
}