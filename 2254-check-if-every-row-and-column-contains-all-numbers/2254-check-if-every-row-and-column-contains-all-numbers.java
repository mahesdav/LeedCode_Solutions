class Solution {
    public boolean checkValid(int[][] matrix) {

        int length = matrix.length;

        for(int i=0;i<length;i++){
            boolean[] isRowVisited = new boolean[length+1];
            boolean[] isColumnVisited = new boolean[length+1];
            for(int j=0;j<matrix[i].length;j++){
                int rVal = matrix[i][j];
                int cVal = matrix[j][i];
                if(isRowVisited[rVal] || isColumnVisited[cVal]){
                    return false;
                }else{
                    isRowVisited[rVal] = true;
                    isColumnVisited[cVal] = true;
                }
            }
        }
        return true;
       
    }
}