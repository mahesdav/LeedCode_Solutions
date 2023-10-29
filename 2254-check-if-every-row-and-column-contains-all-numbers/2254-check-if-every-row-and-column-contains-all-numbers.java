class Solution {
    public boolean checkValid(int[][] matrix) {

        int length = matrix.length;

       // Set<Integer> set = new HashSet();

        // for(int i=0;i<length;i++){
        //     if(set.contains(matrix[0][i]))
        //       return false;
        //     else
        //      set.add(matrix[0][i]);
        // }
       
        for(int i=0;i<length;i++){
           // Set<Integer> internalSet = new HashSet();
            boolean[] isRowVisited = new boolean[length+1];
            boolean[] isColumnVisited = new boolean[length+1];
            for(int j=0;j<matrix[i].length;j++){
               // if(internalSet.contains(matrix[i][j]) || !set.contains(matrix[i][j])){
                int rVal = matrix[i][j];
                int cVal = matrix[j][i];
                if(isRowVisited[rVal] || isColumnVisited[cVal]){
                    return false;
                }else{
                    // internalSet.add(matrix[i][j]);
                    isRowVisited[rVal] = true;
                    isColumnVisited[cVal] = true;
                }
            }
            i=i;
        }
        return true;
        // Set< String > set = new HashSet<>();
        // for ( int i = 0; i < matrix.length; i++ )
        //     for ( int j = 0; j < matrix.length; j++ )
        //         if (!set.add(matrix[i][j]+"r"+i) || !set.add(matrix[i][j] +"c"+j)) return false;
        // return true;
    }
}