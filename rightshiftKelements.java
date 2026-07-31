import java.util.Arrays;

public class rightshiftKelements {
    static int[] shiftK (int [] arr ,int no){
        no=no%arr.length ;
        reverse( arr , 0 , arr.length -1);
        reverse(arr , 0 , no-1) ;
        reverse(arr , no , arr.length-1) ;
        return arr ;
    }
    static void reverse (int [] arr , int start , int end){
        while (start<end){
            int temp = arr[start] ;
            arr[start] = arr[end] ;
            arr[end] = temp ;
            start++ ;
            end-- ;
        }
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7} ;
        System.out.println(Arrays.toString(shiftK(arr , 3))) ;
    }
}
