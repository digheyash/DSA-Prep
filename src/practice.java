import java.util.*;

public class practice {
    static boolean linear_search (int[] arr , int target){
        for(int i=0 ; i< arr.length;i++){
            if(arr[i]== target){
                return true;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        //System.out.println("hello world");
        int arr [] = {1,2,3,4,5,6};
        System.out.println(linear_search(arr,4));
    }
}