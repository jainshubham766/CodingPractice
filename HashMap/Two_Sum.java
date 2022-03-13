//Question: https://leetcode.com/problems/two-sum/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Brute Force Approach O(n^2)
        
//         int response[]=new int[2];
//         ii:
//         for (int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if (nums[i]+nums[j]==target){
//                     response[0]=i;
//                     response[1]=j;
//                     break ii;
//                 }
//             }
//         }
//         return response;
        
        
        // Approach Using HashMap<>  tC: O(n)
        //https://www.code-recipe.com/post/two-sum
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for (int i=0;i<nums.length;i++){
            int delta = target -nums[i];
            if (map.containsKey(delta)){
                int []arr = {i,map.get(delta)} ;
                return arr;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
