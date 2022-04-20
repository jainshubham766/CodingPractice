/*
 Question:
https://leetcode.com/problems/merge-sorted-array/
Solution: 
https://leetcode.com/problems/merge-sorted-array/discuss/972587/Basically-the-Cracking-the-Code-Interview-solution-with-explanation
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            //Method 01 :  Brute's Force Approach
//         int result[] = new int[m+n];
//         int i = 0, j=0,k=0;

//         if (m==0 && n==0) return;

//         while(i<m   &&  j<n){
//              if (nums1[i] == arr2[j]){
//                 result[k]=nums1[i];
//                 k++; i++;
//                 result[k]=arr2[j];
//                   j++; k++;
//             }
//             else if(nums1[i] <arr2[j]){
//                 result[k]=nums1[i];
//                 i++; k++;
//             }
//             else if (nums1[i] >arr2[j]){
//                 result[k]=arr2[j];
//                 j++; k++;
//             }
//         }
//         while (j<n){
//             result[k]=arr2[j];
//             k++; j++;
//         }
//         while (i<m){
//             result[k]=nums1[i];
//             k++; i++;
//         }

//     for (i=0;i<(m+n);i++){
//         nums1[i]=result[i];
//     }

                //Method 02

        if (n==0) return;
        int i=m-1, j=n-1, k=(m+n-1);

        while ( j>=0){
            if (i>=0    &&  nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }else {
                 nums1[k]=nums2[j];
                j--;
                k--;
            }
        }


    }
}
/*
This is not my solution. It's a tweak of the solution in Cracking the Code Interview. But I wanted to share it, since it's clever and I didn't see it mentioned in the top discussions. Everything I saw had more than 2 conditionals or loops, or ternaries that made the solution harder to read.

Here's how it works. Instead of starting at the beginning, then having to shift the array over when you've inserted into the first array, work backwards. Start at the end of both arrays, you know that the biggest of these two must be the last one in the merged array, so replace the (empty) spot at the end of the merged array, then move your indexes to the left and repeat. Also, keep an index on the current spot to insert at. Eventually you'll run out of empty spots, and start overwriting spots in nums1. This is OK though, because at the point this happens, all the elements that are bigger than the index at which you're inserting area already present in the array where there used to be empty space! */
