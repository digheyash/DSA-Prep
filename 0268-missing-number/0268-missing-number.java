class Solution {
    public int missingNumber(int[] nums) {
        int XOR1 = 0 ;
        int XOR2 = 0 ;

        for(int i : nums){
            XOR1 = XOR1^i ;
        }
        for(int j = 0 ; j<= nums.length ; j++){
            XOR2 = XOR2^j ;
        }
        int num =XOR1^XOR2 ;
        return num ;
    }
}