public class perfectNo {
    public int perfect(int n) {
        int sum = 1; // 1 is always a divisor (except for n=1)
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                sum=sum+i+(n/i);
            }
        }
        return sum;
    }
        public static void main(String[] args) {
            perfectNo p = new perfectNo();
            int n = 28;
            int result = p.perfect(n);
            if(result == n){
                System.out.println(n + " is a perfect number.");
            } else {
                System.out.println(n + " is not a perfect number.");
            }
        }
}
