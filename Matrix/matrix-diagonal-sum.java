Question: https://leetcode.com/problems/matrix-diagonal-sum/
Solution: https://leetcode.com/problems/matrix-diagonal-sum/discuss/1071165/Using-just-one-loop-and-an-if-or-Java-100-faster-or-Easy-to-understand

class Solution {
    public int diagonalSum(int[][] mat) {

        //bRUTE fORCE     --> O(n^2)
        //Not a Square Matrix
//         if (mat.length!=mat[0].length) return -1;
//         int primary = 0,secondary=0;
//         for (int i=0;i<mat.length;i++){
//             for( int j=0;j<mat[0].length;j++){
//                 if (i==j){
//                     System.out.println(mat[i][j]);
//                     primary += mat[i][j];
//                 }
//                 if ((i+j)==mat.length-1){
//                     System.out.println(mat[i][j]);
//                     secondary +=mat[i][j];
//                 }
//             }
//         }

//         // if length is -ve remove the centre element which is added twice;
//         int dif = 0;
//         if(mat.length % 2 != 0){
//             int i = mat.length/2;
//             dif = mat[i][i];
//         }
//         return primary+secondary-dif;

        //Approach 02 --> O(n)

        int primary = 0, secondary = 0, k = mat.length-1;

        for (int i=0;i<mat.length;i++){
             primary += mat[i][i];
            secondary += mat[i][k--];
        }
// if length is -ve remove the centre element which is added twice;
        if(mat.length % 2 != 0)  return secondary + primary-  mat[mat.length/2][mat.length/2];

        return primary+secondary;

    }
}
