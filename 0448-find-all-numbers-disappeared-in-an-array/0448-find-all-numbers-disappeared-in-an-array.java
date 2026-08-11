import java.util.* ;
class SolutionfindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>() ;
        for (int i=0 ; i < nums.length ; i++){
            int value = Math.abs(nums[i]) ;
            int index= value -1 ;
            if(nums[index]>0){
                nums[index]=-nums[index] ;
            }

        }
        for(int j=0 ;j<nums.length ;j++){
            if(nums[j]>0){
                list.add(j+1) ;
            }
        }
        return list ;
    }
}