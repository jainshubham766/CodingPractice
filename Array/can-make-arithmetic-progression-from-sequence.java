Question: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

Solution: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/discuss/1853891/Java-O(NlogN)-Approach

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        //Brute Force Approach

        Arrays.sort(arr);
        final int diff = arr[1]-arr[0];
        for (int i=1;i<arr.length-1;i++){
            if((arr[i+1]-arr[i]) != diff) return false;
        }
        return true;

    }
}
