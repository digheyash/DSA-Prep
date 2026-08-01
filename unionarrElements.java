import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class unionarrElements {
    static Set<Integer> unoinarr (int [] arr1 , int [] arr2){
        HashSet<Integer> result = new HashSet<Integer>() ;
        for(int i : arr1){
            result.add(i) ;
        }
        for(int j : arr2){
            result.add(j) ;
        }
        return result ;
    }

    public static void main(String[] args){
        int [] arr1 = {1,2,3,4,5,6,7} ;
        int [] arr2 = {2,5,8,9,11,3} ;
        System.out.println(unoinarr(arr1 ,arr2)) ;
    }
}
