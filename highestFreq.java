import java.util.* ;
public class highestFreq {

    static void highFreq (int [] arr ){
        HashMap<Integer,Integer> freq = new HashMap<>() ;
        for (int num :arr){
            freq.put(num,freq.getOrDefault(num , 0)+1) ;
        }
        for (int nums : freq.keySet()){
            System.out.println( nums +" => "+freq.get(nums) ) ;
        }
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,2,3,4,2,4,5,6,4,4,4,6,6,7} ;
        highFreq(arr) ;
    }
}
