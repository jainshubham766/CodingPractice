/*
 * Segregate 0s and 1s
 *
 * Given an array of length N consisting of only 0s and 1s in random order. Modify the array to segregate 0s on left side and 1s on the right side of the array.

Example 1:

Input:
N = 5
arr[] = {0, 0, 1, 1, 0}
Output: 0 0 0 1 1

Example 2:

Input:
N = 4
Arr[] = {1, 1, 1, 1}
Output: 1 1 1 1
Explanation: There are no 0 in the given array,
so the modified array is 1 1 1 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function segregate0and1() which takes arr[] and n as input parameters and modifies arr[] in-place without using any extra memory.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 107
0 ≤ arri ≤ 1

*/

class Solution {
    void segregate0and1(int[] arr, int n) {
        // code here
        int start =0,end =n-1;

        while (start<end)
        {
            if(arr[start] == 1    &&  arr[end] == 0)
            {
                arr[start]=0;
                arr[end]=1;
            }
            if (arr[start]==0)
            {
                start ++;
            }
            if (arr[end]==1)
            {
                end --;
            }
        }
    }
}
