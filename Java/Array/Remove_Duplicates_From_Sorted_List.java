/*
 Question : https://leetcode.com/problems/remove-duplicates-from-sorted-array/

 */
class Solution {
    public int removeDuplicates(int[] nums) {

        //Method 02 2 pointer Approach

        int slow =0, fast =1,k=0;

        if (nums.length==0)return 0;
        if (nums.length==1)return 1;
        if (nums.length==2  &&  nums[0]==nums[1])return 1;

        while (fast<nums.length){
            if(nums[slow]!=nums[fast]){
                nums[k]=nums[slow];
                k++;
            }
            slow++;fast++;
        }

        nums[k]=nums[slow];
        return ++k;

        //Brute Force Approach
//         Set <Integer> set = new HashSet<>();
//         for ( int i=0 ;i<nums.length ; i++){
//             set.add(nums[i]);
//         }
//         int []arr = new int[set.size()];
//         int j=0;
//         for(int i=0;i<nums.length;i++){
//             if (set.contains(nums[i])){
//                 arr[j++] = nums[i];
//                 set.remove(nums[i]);
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//         Arrays.sort(arr);
//         for (int i=0;i<arr.length;i++){
//             nums[i]=arr[i];
//         }
//            return arr.length;

    }
}
