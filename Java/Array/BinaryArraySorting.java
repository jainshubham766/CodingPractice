/*
 * Binary Array Sorting
 * Given a binary array A[] of size N. The task is to arrange the array in increasing order.

Note: The binary array contains only 0  and 1.

Example 1:

Input:
N = 5
A[] = {1,0,1,1,0}
Output: 0 0 1 1 1
Example 2:

Input:
N = 10
A[] = {1,0,1,1,1,1,1,0,0,0}
Output: 0 0 0 0 1 1 1 1 1 1
Your Task:
Complete the function SortBinaryArray() which takes given array as input and returns the sorted array.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Challenge: Try doing it in one pass.

Constraints:
1 <= N <= 106
0 <= A[i] <= 1
*/

class Solution
{
	static int[] SortBinaryArray(int arr[], int n)
	{
	    // code here
	   // Arrays.sort(arr);
	   //  return arr;
	   int start =0,end =n-1;
	   while (start<=end){
	       if (arr[start]==1 && arr[end]==0)
	       {
	           arr[start]=0;
	           arr[end]=1;
	       }
	       if(arr[start]==0)
	       {
	           start++;
	       }
	       if (arr[end]==1)
	       {
	           end--;
	       }

	   }
	   return arr;
	}
}
