public class searchinRotatedSortedArray {
    static int pivotindex (int [] arr){
        int s=0 ;
        int e= arr.length-1 ;

        while(s<e){
            int mid =s+(e-s)/2 ;
            if(arr[mid]>arr[e]){
                s=mid+1 ;
            }
            else{
                e=mid ;
            }
        }
        return e ;
    }
    static int search(int[] nums, int target) {
        int pivot =pivotindex(nums) ;
        int s1 = 0 ;
        int e1 = pivot-1 ;
        int s2 = pivot ;
        int e2 = nums.length-1 ;
        if( s1<=e1 && nums[s1]<=target && target<=nums[e1] ){
            while(s1<=e1){
                int mid =s1+(e1-s1)/2 ;
                if(nums[mid]>target){
                    e1=mid-1 ;
                }
                else if(nums[mid]==target){
                    return mid ;
                }
                else{
                    s1=mid+1 ;
                }
            }
        }

        if(s2<=e2 &&  nums[s2]<=target && target<=nums[e2]){
            while(s2<=e2){
                int mid =s2+(e2-s2)/2 ;
                if(nums[mid]>target){
                    e2=mid-1 ;
                }
                else if(nums[mid]==target){
                    return mid ;
                }
                else{
                    s2=mid+1 ;
                }
            }
        }
        return -1 ;
    }

    public static void main(String[] args){
        int [] arr ={4,5,6,7,0,1,2,3} ;
        System.out.println(search(arr,0));
    }
}


