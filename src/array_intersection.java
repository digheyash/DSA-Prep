public class array_intersection {
    static void arrIntersect (int [] arr1, int [] arr2){
        int [] result = new int[Math.min(arr1.length,arr2.length)] ;
        for (int i=0 ; i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] +" ");
                }

            }
        }
    }

    public static void main(String[] args){
        int[] arr1 ={1,2,3,4,5,} ;
        int [] arr2 ={4,5,6,7,8} ;
        arrIntersect(arr1,arr2) ;
    }
}
