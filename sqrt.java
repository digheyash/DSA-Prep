class sqrt {
    static int mySqrt(int x) {
        int s=1 ;
        int e =x ;
        int ans=0 ;

        while(s<=e){
            int mid =s +(e-s)/2 ;
            if(mid<x/mid){
                ans =mid ;
                s=mid+1 ;
            }
            else if(mid==x/mid){
                return mid ;
            }
            else{
                e=mid-1 ;
            }
        }
        return ans ;
    }
    public static void main(String[] args){
        System.out.println(mySqrt(56));
    }
}