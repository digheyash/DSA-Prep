public class extremeElement {
    static void extreme (int [] arr){


        for (int i = 0, j = arr.length - 1; i <j; i++, j--) {
            System.out.println(arr[i] + " " + arr[j]);
        }

    }

    public static void main(String[] args){
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        extreme(arr);
    }
}
