import java.util.Arrays;

public class ShiftElement {
    static int [] rightShift (int [] arr){
        //int [] result = new int [arr.length] ;
        int p = arr[arr.length-1] ;
        for (int i =arr.length-1 ; i>0 ; i--){
            arr[i]=arr[i-1] ;
        }
        arr[0] = p ;
        return arr ;
    }
    public  static void main (String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9} ;
        System.out.println(Arrays.toString(rightShift(arr))) ;
        System.out.println(Arrays.toString(rightShift(arr))) ;

    }

}
