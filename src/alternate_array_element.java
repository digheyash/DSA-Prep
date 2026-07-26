import java.util.Arrays;

public class alternate_array_element {
    static int [] alternateArr(int[] arr){
        int [] result = new int[arr.length] ;
        for (int i=0;i<(arr.length-1);i+=2){
            //int j =arr[i] ;
            result[i]=arr[i+1] ;
            result[i+1]=arr[i] ;
        }
        if((arr.length%2)!=0){
            result[arr.length-1]=arr[arr.length-1] ;
        }
        return result ;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11} ;
//        System.out.println(arr) ;
        int [] final_ = alternateArr(arr) ;
        System.out.println( Arrays.toString(final_)) ;
    }
}
