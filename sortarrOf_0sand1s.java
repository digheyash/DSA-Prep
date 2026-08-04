import java.util.Arrays;

public class sortarrOf_0sand1s {
    /*static int [] sort1sn0s (int [] arr ){
        int count =-1 ;
        for(int i : arr){
            if (i == 0){
                count +=1 ;
            }
        }
        for(int j=0  ;j<=count ; j++ ){
            arr[j]=0 ;

        }
        for(int k=count+1 ;k<arr.length ;k++){
            arr[k]=1 ;
        }
        return arr ;
    }*/
    static int [] sort1sn0s (int[] arr){
        int i =0 ,j=arr.length-1 ;
        while( i<=j ){
            if(arr[i]==1&&arr[j]==0){
                int temp =arr[i] ;
                arr[i]=arr[j] ;
                arr[j]=temp ;
            }
            if(arr[i]==0){
                i++ ;
            }
            if(arr[j]==1){
                j-- ;
            }
        }
        return arr ;
    }
    public static void main(String[] args){
        int [] arr ={1,0,0,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1,0} ;
        System.out.println(Arrays.toString(sort1sn0s(arr)));
    }
}
