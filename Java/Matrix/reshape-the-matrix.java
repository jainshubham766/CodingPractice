Question: https://leetcode.com/problems/reshape-the-matrix/
Solution: 1. https://leetcode.com/problems/reshape-the-matrix/discuss/1727031/JAVA-SOLUTION-oror-DETAILED-EXPLANATION-oror-EASY-APPROCH-oror-100-Efficent
2. https://leetcode.com/problems/reshape-the-matrix/discuss/1862993/Simple-Java-Approach

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        //If the product of rows & cols of mat matrix and the new matrix are not same then return original matrix
        if ((mat.length * mat[0].length) != (r*c))   return mat;
        
        //Creating the new matrix
        int [][]result = new int [r][c];
        
        //result Array Counters
        int newr = 0, newc=0;
        
        //Traversing the mat matrix and storing the its values in new matrix output cols wise
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
               result[newr][newc] = mat[i][j];
               newc++;       
                //if the cols value reached then change the row and set the cols value to 0.
                                // System.out.println(newr+" "+newc);
                if (newc==c){
                    newc=0;
                    newr++;
                }
                
            }
        }
        return result;
    }
}
