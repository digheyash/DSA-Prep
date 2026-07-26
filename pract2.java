public class pract2 {
    static int [] sumpposinegi (int [] arr){
        int posisum=0;
        int negisum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negisum+=arr[i];
            }
            else{
                posisum+=arr[i];
            }

        }
        //int maxi = arr[0];
        // for(int i=0;i<arr.length;i++){
        // maxi = Math.max(maxi,arr[i]);
           /* if (maxi<arr[i]){
                maxi =arr[i];
            }*/
        // }
        //return maxi;
        return new int []{posisum, negisum};
    }
    public static void main(String[] args){
        int [] arr = {1,-2,9,-11,-8,-5};
        int [] result = sumpposinegi(arr);
        System.out.println("The posiSum is "+result[0]);
        System.out.println( "NegiSum is : "+result[1]);
    }
}