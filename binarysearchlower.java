import java.util.Arrays;

public class binarysearchlower {
    static int getLowerIndex (int [] arr ,int target ){
        int n =arr.length ;
        int s =0 ;
        int e= n-1 ;

        int ans =n ;
        while (s<e){
            int mid =s + (e-s)/2 ;
            if (arr[mid]>=target){
                ans =mid ;
                e= mid -1 ;
            }
            else {
                s= mid+1 ;
            }
        }
        return ans ;
    }

    public static void main(String[] args){
        int [] arr = {1,2,3,4,4,5,6,7,8,23,45,54} ;
        System.out.println(getLowerIndex(arr ,4)) ;

    }

}
