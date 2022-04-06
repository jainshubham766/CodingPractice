Question: https://leetcode.com/problems/container-with-most-water/

Solution: https://leetcode.com/problems/container-with-most-water/discuss/1915172/JavaC%2B%2B-Easiest-Explanations

https://leetcode.com/problems/container-with-most-water/discuss/1915231/Java-2-Approaches%3A-BF-and-Two-Pointers-with-Image-Explaination-or-Code-Commented


class Solution {
    public int maxArea(int[] height) {

//         Brute Froce
// It's easy to use the brute force approach, the total states is C(n, 2)= n * (n - 1) / 2,
// we have to enumerate all these states to get the max area.
// The time complexity is O(n^2), exceed the time limit.

    // BF time: O(n^2) space: O(1)
    // TimeOut
        /*
        int len = height.length;
        int max = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, area);
            }
        }

        return max;
    */

       // Two Pointers
// In each state S(i, j), no matter whether the left line or right line moves to the middle, it will cause less wide to width - 1:

// Move the short line, the short line min(h[i], h[j]) of the container may hold more water, the area may increase.
// Move the long line, the short line min(h[i], h[j]) of the container will remain the same or less, so the area will definitely become less.


        int left = 0;
        int right = height.length-1;
        int max = 0;

        while (left < right){
            int w = right - left;
            int h = Math.min(height[left],height[right]);
            //Calculate Area
            int area = w * h;
            //Store the max value
            max = Math.max(max, area);

            if (height[left]< height[right])    left++;
            else if  (height[left]> height[right])   right--;
            else { left ++; right--;}

        }
         return max;
    }
}
