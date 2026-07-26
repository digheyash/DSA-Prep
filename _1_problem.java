
import java.util.*;

public class _1_problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the value of arr[" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is :");
        // Read this as: "For every integer array (row) inside 'arr'"
        for (int[] row : arr) {
            // Read this as: "For every integer (val) inside the current 'row'"
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
            sc.close();
        }

    }
}
