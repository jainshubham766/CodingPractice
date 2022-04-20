Question: https://leetcode.com/problems/move-zeroes/
Solution: https://leetcode.com/problems/move-zeroes/discuss/1866888/Multiple-Java-Approaches-With-Easy-Explaination

class Solution {
    public void moveZeroes(int[] nums) {

        //Base Case
        if(nums.length==1) return;

        //Brute Force       --> O(n^2)

        /*first step, try coming up with a solution that makes use of additional space.
        For this problem as well, first apply the idea discussed using an additional array
        and the in-place solution will pop up eventually.*/
//--------------------------------------------------------------------------------------------------------------

 //Aproach 02:  2 pointer Approach      --> O(n)
        // int i=0,j= i+1;
        // while (j<nums.length){
        //     if (nums[j]!=0    && nums[i]==0) {
        //         nums[i] = nums[j];
        //         nums[j] = 0;
        //     }
        //     if (nums[i] != 0) i++;
        //     j++;
        // }
//--------------------------------------------------------------------------------------------------------------

        //Approach 03 :  Single Pointer Approach      --> O(n)
                      // 1. Shift non-zero values as far forward as possible
                      // 2. Fill remaining space with zeros
        int start=0;

        for (int i=0; i<nums.length; i++){
            if (nums[i]!=0) {
                nums[start++] = nums[i];
            }
        }

        for (int i= start; i<nums.length;i++){
            nums[i]=0;
        }
    }
}
