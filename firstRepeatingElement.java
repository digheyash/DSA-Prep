//Problem Statement Summary:
//   Input: You are given an array of integers that may contain duplicate values.
//   Goal: You need to find the first element in the array that repeats later in the sequence.
//   Output: Return the value of this element. If no element repeats, typically the problem
//   requires returning -1 (31:12 - 31:25).
//Example:
//   If the input is [10, 5, 3, 4, 3, 5, 6], the output would be 5, because 5 is the first
//   number encountered (scanning from left to right) that has a duplicate appearing
//   elsewhere in the array (27:05 - 27:26).
import java.util.* ;
public class firstRepeatingElement {
    static int firstRepeat (int [] arr ){
        // Anti - pattern Solution
//        int i =0 ;
//        int j = i+1 ;
//        for(; j< arr.length ; j++){
//            if(arr[i]==arr[j]){
//                return arr[i] ;
//            }
//            if(j==arr.length-1){
//                i=i+1 ;
//                j=i ;
//            }
//
//
//        }
        HashMap<Integer,Integer> seen = new HashMap<>() ;
        for (int i : arr){
            seen.put(i,seen.getOrDefault(i,0)+1) ;
        }
        for(int i : arr){
            if(seen.get(i)>1){
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,7,4,5,6} ;
        System.out.println(firstRepeat(arr));
    }
}
