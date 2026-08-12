class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list =new ArrayList<>() ;
        int strow =0;
        int endcol=matrix[0].length-1 ;
        int stcol =0 ;
        int endrow= matrix.length-1 ;
        while(strow <= endrow && stcol <= endcol){
            //left to right
            for(int i=strow , j=stcol ;j<=endcol ;j++){
                list.add(matrix[i][j]) ;
            }
            strow++ ;

            //top to bottom 
            for(int j=endcol , i=strow ;i<=endrow ;i++){
                list.add(matrix[i][j]) ;
            }
            endcol-- ;

            //right to left 
            if(strow <= endrow){for(int i=endrow , j=endcol ;j>=stcol ;j--){
                list.add(matrix[i][j]) ;
            }
            endrow-- ;
            }

            //bottom to top 
            if(stcol <= endcol){for(int j=stcol , i=endrow ;i>=strow ;i--){
                list.add(matrix[i][j]) ;
            }
            stcol++ ;
            }

        }

        return list ;
    }
}