/*
Question : https://leetcode.com/problems/single-number/
 *
Solution: 
 https://leetcode.com/problems/single-number/discuss/1773197/3-Solution-in-Java-oror-Interview-Approach
 */

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int num =nums[nums.length-1];

        // Approach 01:
//             for (int i=0;i<nums.length-2;i+=2){

//             if (nums[i]==nums[i+1]){
//                 continue;
//             }
//             else {
//                 num =nums[i];
//                 break;
//              }
//             }



        //Approach 02:

        for(int i=0;i<nums.length-2;i+=2){
            if (nums[i]!=nums[i+1]) return nums[i];
        }
        return num;



        //Approach 03: By using hash map Refer LINK
        //https://leetcode.com/problems/single-number/discuss/1773197/3-Solution-in-Java-oror-Interview-Approach
    }
}




//Anther Interview Approach



First Solution that comes to mind have to be running a loop in the array and check elements pairwise.

class Solution {
    public int singleNumber(int[] nums) {
	Arrays.sort(nums);
        for(int i=0 ; i<nums.length-1; i+=2){
            if(nums[i]!=nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
Time Complexity :- O(nlogn)
Space Complexity:- O(1).

Next Approach would be using a HashMap. Storing an element in the map along with its count. If duplicate element is found then increase the count by 1. At the end return the element which has count=1.

class Solution {
    public int singleNumber(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        Map<Integer, Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                int count=map.get(i);
                map.put(i,++count);
            }else{
                map.put(i,1);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i)==1)
                return i;
        }
        return -1;
		}
		}
		```
		Time Complexity:- O(nlogn)
		Space Complexity:- O(n)

		Third is the best solution using XOR. Using XOR on array elements would automatically return the distinct element.

		```
		class Solution {
    public int singleNumber(int[] nums) {
	if(nums==null || nums.length==0) return 0;
        int xor=0;
        for(int i:nums){
            xor ^=i;
        }
        return xor;
		}
		}
		```
		Time Complexity:- O(n).
		Space Complexity:- O(1).
