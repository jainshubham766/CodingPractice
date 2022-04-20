/*Number of occurrence 
 *
 * Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example 1:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.
Example 2:

Input:
N = 7, X = 4
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 0
Explanation: 4 is not present in the
given array.
Your Task:
You don't need to read input or print anything. Your task is to complete the function count() which takes the array of integers arr, n and x as parameters and returns an integer denoting the answer.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 106
1 ≤ X ≤ 106
*/


class Solution {
    int count(int[] arr, int n, int x) {
        // code here\
        int l = bSearch(arr,x,false);
        int r = bSearch(arr,x,true);
        if (r==-1)
        {
            return 0;
        }
        return r-l+1;
        
    }
    
    public int bSearch(int []arr,int key,boolean flag)
    {
        int start=0;
        int end = arr.length-1;
        int mid=0 ,ans =-1;
        
        while (start<=end){
            mid=(start+end)/2;
            
            if(arr[mid]==key)
            {
                ans=mid;
                if (flag)
                {
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            else if (arr[mid]>key){
                end = mid-1;
            }
            else {
                start=mid+1;
            }
        }
        
        return ans;
    }
    
}
