/*
 https://leetcode.com/problems/contains-duplicate/
 * */

class Solution {
    public boolean containsDuplicate(int[] nums) {

             //Method 01: Using HashSet
    //     Set<Integer> set = new HashSet<Integer> ();
    //      for (int i=0; i<nums.length; i++ ){
    //        set.add(nums[i]);
    //     }
    //    if (set.size()==nums.length)
    //     return false;
    // return true;

             //Method 02: Bruate-Force Aproach
        //  Arrays.sort(nums); // Sorting the array
        // // Run a loop till end;
        // for (int i =0 ; i<nums.length-1; i++){
        //     if(nums[i] == nums[i+1]) return true;
        //     // if the value of current index is equals to next index, then return true
        // }
        // return false; // otherwise return false


                 // Method 03: Using HashSet
        // Created HashSet to store all different Integers
        Set<Integer> set = new HashSet<>();
        for (int i: nums){ // run loop till end
                if(!set.add(i))return true;// if we found the similar value which is already present in set, then no need to add simply return true;
            // as it mean's the one of the same value is already over there
        }
        return false;// otherwise, return false
    }
}
