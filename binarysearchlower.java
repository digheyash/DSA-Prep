import java.util.Arrays;

public class binarysearchlower {
    static int getLowerIndex (int [] arr ,int target ){
        int n =arr.length ;
        int s =0 ;
        int e= n-1 ;
        int mid =s + (e-s)/2 ;
        int ans =n ;
        while (s<e){
            if (arr[mid]>=target){
                ans =mid ;
                e= mid -1 ;
                mid =s + (e-s)/2 ;
            }
            else {
                s= mid+1 ;
                mid =s + (e-s)/2 ;
            }
        }
        return ans ;
    }

    public static void main(String[] args){
        int [] arr = {1,2,3,4,4,5,6,7,8,23,45,54} ;
        System.out.println(getLowerIndex(arr ,4)) ;

    }

}
