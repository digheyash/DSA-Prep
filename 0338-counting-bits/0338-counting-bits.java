class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for (int i=0 ; i<=n ; i++){
            int count =0;
            int j =i;
            while (j >0){
                count += j&1 ;
                j>>=1;
            }
            arr[i]=count;
        }
        return arr;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 5;
        int[] result = s.countBits(n);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}