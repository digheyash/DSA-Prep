import java.util.Arrays;

public class reverseArray {
    static int [] arr (int[] arr){
        int [] result = new int[arr.length] ;
        for(int i=arr.length-1 ,  j=0 ; i>=0 && j< arr.length ; i--,j++){
            result[j] = arr[i] ;

        }
        return result ;
    }

    static int [] arry (int[] arr){
        //int [] result = new int[arr.length] ;
        for(int i=arr.length-1 ,  j=0 ; i>=arr.length/2 && j< arr.length/2 ; i--,j++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        return arr ;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11} ;
        System.out.println(Arrays.toString( arr(arr)));
        //arr(arr) ;
        System.out.println(Arrays.toString( arry(arr)));

    }
}
