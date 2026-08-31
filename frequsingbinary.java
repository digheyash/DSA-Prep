public class frequsingbinary {
    static int nooccurence (int [] arr , int target){
        int s=0 ;
        int e= arr.length-1 ;
        int low=e ;
        int upper=e ;
        while (s<=e){
            int mid =s+(e-s)/2 ;
            if(arr[mid]>=target){
                low=mid ;
                e=mid-1 ;
            }
            else{
                s=mid+1 ;
            }
        }

        s=0 ;
        e= arr.length-1 ;
        while (s<=e){
            int mid =s+(e-s)/2 ;
            if(arr[mid]<=target){

                s=mid+1 ;
            }
            else{
                upper=mid ;
                e=mid-1 ;
            }
        }

        return upper-low ;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,4,5,6,6,7,8} ;
        System.out.println(nooccurence(arr ,6)) ;

    }
}
