Question: https://leetcode.com/problems/check-if-it-is-a-straight-line/
Solution: https://leetcode.com/problems/check-if-it-is-a-straight-line/discuss/1866791/Java-or-Simple-code-with-explanation-or-100-fast-or-O(1)-space


class Solution {


    public boolean checkStraightLine(int[][] coordinates) {

        for (int i=2;i<coordinates.length;i++){
            if (!isStraightLine(coordinates[i],coordinates[0],coordinates[1]))  return false;
        }
        return true;
    }

    public boolean isStraightLine(int[]p1,int[]p2,int[]p3) {
        int x=p1[0],y=p1[1];
        int x1=p2[0],y1=p2[1];
        int x2=p3[0],y2=p3[1];
        return ((y-y1)*(x2-x1)) ==  ((x-x1)*(y2-y1));
    }
}
