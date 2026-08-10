class Solution {
    public void gameOfLife(int[][] board) {
        int[][] clone =new int[board.length][board[0].length] ;
        for(int i=0 ; i<board.length ;i++){
            for(int j=0 ;j<board[0].length ;j++){
                clone[i][j] =board[i][j] ;
            }
        }
        for(int i=0 ; i<board.length ;i++){
            for(int j=0 ;j<board[0].length ;j++){
                int count = neighbourcount(i,j,clone) ;
                if(clone[i][j]==1&&(count==2||count==3)){
                    board[i][j]= 1;
                }
                else{
                    board[i][j]= 0;
                }

                if(clone[i][j]==0&&(count==3)){
                    board[i][j]= 1;
                }
            }
        }
    }
    private int neighbourcount (int i , int j,int [][] arr){
        int count =0;
        if(i+1<arr.length&& arr[i+1][j]==1) count++ ;
        if(j+1<arr[0].length&& arr[i][j+1]==1) count++ ;
        if(i-1>=0&& arr[i-1][j]==1) count++ ;
        if(j-1>=0&& arr[i][j-1]==1) count++ ;

        if(i+1<arr.length&&j+1<arr[0].length &&arr[i+1][j+1]==1) count++ ;
        if(i-1>=0&&j+1<arr[0].length &&arr[i-1][j+1]==1) count++ ;
        if(i-1>=0&&j-1>=0&& arr[i-1][j-1]==1) count++ ;
        if(i+1<arr.length&&j-1>=0&& arr[i+1][j-1]==1) count++ ;

        return count ;
    }
}