class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0 , j = numbers.length-1 ;
        int [] arr = new int[2] ;
        while (i<j){
            int current = numbers[i] + numbers[j] ;
            if(current ==target){
                arr[0] = i+1 ;
                arr[1] = j+1 ;
                break ;
            }
            if(current < target){
                i++ ;
            }
            if(current > target){
                j-- ;
            }
        }
        return arr ;
    }
}