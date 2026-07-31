import java.util.* ;
public class highestFreq {

    static String highFreq (int [] arr ){
        HashMap<Integer,Integer> freq = new HashMap<>() ;
        for (int num :arr){
            freq.put(num,freq.getOrDefault(num , 0)+1) ;
        }
        int maxval = -1 ;
        int maxkey = -1 ;
        for (int currentkey : freq.keySet()){
           // System.out.println( nums +" => "+freq.get(nums) ) ;
            if(freq.get(currentkey) > maxval){
                maxval = freq.get(currentkey) ;
                maxkey = currentkey ;
            }


        }
        //return maxkey ;
        return ("Number with highest freq is : "+ maxkey + " and its frequency is : " + freq.get(maxkey)) ;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,2,3,4,2,4,5,6,4,4,4,6,6,7} ;
        System.out.println( highFreq(arr)) ;
        //highFreq(arr) ;
    }
}
