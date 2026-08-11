import java.util.* ;
class SolutionfindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int [] result =new int[2] ;
        for (int i=0 ;i< nums.length ;i++){
            int value = Math.abs(nums[i]) ;
            int index = value-1 ;
            if(nums[index]<0){
                result[0]=value ;
            }
            if(nums[index]>0){
                nums[index]=-nums[index] ;
            }
        }
        for (int j=0 ;j< nums.length ;j++){
            if(nums[j]>0){
                result[1]=j+1 ;
            }
        }
        return result ;
    }
}