class Solutionrotate {
    public void rotate(int[][] matrix) {
        int n= matrix.length ;
       
        for (int i=0 ;i<n ;i++){
            for(int j=i+1 ;j<n ;j++){
                int p= matrix[j][i] ;
                matrix[j][i]=matrix[i][j] ;
                matrix[i][j]=p ;
            }
        }
        for(int i=0 ;i<n ;i++){
            for(int p=0,q=n-1 ;p<q ;p++,q--){
                int temp = matrix[i][p] ;
                matrix[i][p]=matrix[i][q] ;
                matrix[i][q]= temp;
            }
        }


    }
}