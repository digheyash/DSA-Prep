import java.util.* ;
public class highestLowestfreqElement {

    static String highlowFreq (int [] arr ){
        HashMap<Integer,Integer> freq = new HashMap<>() ;
        for (int num :arr){
            freq.put(num,freq.getOrDefault(num , 0)+1) ;
        }
        int maxval = Integer.MIN_VALUE ;
        int minval = Integer.MAX_VALUE ;
        int maxkey = -1 ;
        int minkey = -1 ;
        for (int currentkey : freq.keySet()){
            // System.out.println( nums +" => "+freq.get(nums) ) ;
            if(freq.get(currentkey) > maxval){
                maxval = freq.get(currentkey) ;
                maxkey = currentkey ;
            }
            if(freq.get(currentkey) < minval){
                minval = freq.get(currentkey) ;
                minkey = currentkey ;
            }


        }
        int [] result = new int [2] ;
        result[0] = maxkey ;
        result[1] = minkey ;
        //return maxkey ;
        return ("Number with highest freq is : "+ maxkey + " and its frequency is : " + freq.get(maxkey)
                + "\nNumber with lowest freq is : "+ minkey + " and its frequency is : " + freq.get(minkey)) ;
    }
    public static void main(String[] args){
        int [] arr = {2,3,4,2,3,4,2,4,5,6,4,4,4,6,6,7} ;
        System.out.println( highlowFreq(arr)) ;
        //highFreq(arr) ;
    }
}
