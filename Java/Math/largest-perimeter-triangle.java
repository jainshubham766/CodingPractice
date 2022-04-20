Question: https://leetcode.com/problems/largest-perimeter-triangle/
Solution: https://leetcode.com/problems/largest-perimeter-triangle/discuss/1851108/Java-Approach-with-Video-Explaination



class Solution {
    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        int m=nums.length;
        for (int i=m-1;i>1;i--){
            if (nums[i]<(nums[i-1]+nums[i-2])){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
}

