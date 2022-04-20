Question : https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

Solution: https://leetcode.com/problems/middle-of-the-linked-list/discuss/1953012/Java-100-orMultiple-Approachor-Two-pointer-approach-or-Explained



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {


        //Brute Force Approach: Use one loop to counte no. of nodes.
          // Secode loop to find the mid and return from that point

        ListNode list = head;
        int counter =0;
        //count no. of nodes
        while (list!=null){
            counter++;
            list=list.next;
        }
        //Decide mid node
         int mid = (counter%2 == 0)? (counter+1)/2 : (counter/2);

        list = head;
        counter=0;
        //return from mid node
        while (counter!=mid){
            list=list.next;
            counter++;
        }

        return list;


//         Alternative Approach: Using Extra Space

//1. Iterate over the whole linked list and store the data in an ArrayList.
//2. Then find the element by accessing the N/2 index of the ArrayList.
//3. In this case Time Complexity and Space Complexity will be O(N).
     
	//Aproach Two - Pointyers
	//
	//        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null   && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;



    }
}
