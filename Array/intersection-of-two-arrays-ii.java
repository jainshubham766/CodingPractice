https://leetcode.com/problems/intersection-of-two-arrays-ii/


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        //Approach 01:
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List <Integer> list = new LinkedList<>();

        int p1=0, p2=0;

        while (true){
            if (p1>= nums1.length    || p2>= nums2.length){
                break;
            }
            if(nums1[p1] == nums2[p2]){
                list.add(nums1[p1]);
                p1++;p2++;
            } else if (nums1[p1] > nums2[p2]){
                p2++;
            }else if(nums1[p1] < nums2[p2]){
                p1++;
            }

        }

        int result[]= new int [list.size()];
        for (int i =0; i<result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}


//Approach 02: 
//
https://leetcode.com/problems/intersection-of-two-arrays-ii/discuss/1222576/JAVA-Familiar-HashMap-Solution.....-95-faster
