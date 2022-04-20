https://leetcode.com/problems/shift-2d-grid/

https://leetcode.com/problems/shift-2d-grid/discuss/1937479/Very-Easy-Java-Code-With-Explanation

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int r=grid.length;
        int c=grid[0].length;
        int oned[] = new int [r*c];


        // 2-D to 1-D conversion
        // int a=0,b=a;
        // for (int i =0;i< oned.length;i++){
        //     if (b==c) {
        //         b=0;
        //         a++;
        //     }
        //     oned[i] = grid[a][b];
        //     b++;
        // }

        int temp[][] = new int [r][c];

        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int newIndex = (i*c+j+ k) % oned.length;
                int newr = newIndex / c;
                int newc = newIndex % c;
                temp[newr][newc] = grid[i][j];
            }
        }

        // Prepare Result in List
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i = 0; i < r; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j < c; j++) {
                list.add(temp[i][j]);
            }
            result.add(list);
        }

        return result;

    }
}
