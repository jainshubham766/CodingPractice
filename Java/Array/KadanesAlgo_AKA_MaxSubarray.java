//https://leetcode.com/problems/maximum-subarray/

//refer Video : https://www.youtube.com/watch?v=HCL4_bOd3-4

class Solution {
    public int maxSubArray(int[] nums) {

        if (nums.length==1) return nums[0];

// Kadane's Algo ---> didn't work if only -ve number is present

//         int current = 0;
//         int maxSum = 0;
//         for(int i=0; i<nums.length; i++){
//             current += nums[i];
//             if (current>maxSum){
//                 maxSum=current;
//             }
//             if(current<0){
//                 current=0;
//             }
//         }
//         return maxSum;



// Approach 02: Modifing Kandane's Algo to handle -ve no. too


        int sum = 0;
        int max = Integer.MIN_VALUE;        //Only change is here
        int n=nums.length;

        for (int i=0;i<n;i++){

            sum+=nums[i];
             max=Math.max(sum,max);
            if(sum<0) sum=0;
        }
        return max;




    }
}
