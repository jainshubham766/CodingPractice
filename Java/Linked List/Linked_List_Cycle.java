/*
 
 Linked List Cycle 
Question: 
 https://leetcode.com/problems/linked-list-cycle/
Solution Help : 
https://medium.com/@nisargdevdhar/leetcode-solution-72406f05b78a
https://www.youtube.com/watch?v=jcZtMh_jov0
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {

        /*  Method 01 :
        The brute-force solution uses a HashSet.
        Assuming how a basic HashSet works according to the Collections framework.
        We traverse through the entire list starting from the head of the list and add every new node encountered in to           the list .
        Incase we come into a node that has already been encountered in the list then we return false.
        On reaching the last node if all nodes of the list are unique true is returned.

        cons: Space complexcity O(n)

        */

//         Set <ListNode> set= new HashSet<>();

//         while(head!=null){
//             if (set.contains(head)){
//                 return true;
//             }   else {
//                 set.add(head);
//             }
//             head=head.next;
//         }
//         return false;


        /*      Method 02 :
            The optimal method being the use of two pointers. Here we use 2 pointers both starting from the head of the               list. The first pointer holds the present node in the list and the second pointer holds the position of the               node that is 2 nodes away from the current node. This loop iterates till the end and if there is no cycle                 present then returns false, else returns true.
        */

        if (head==null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow!=fast){
//Base case to stop the rotation as we have reached the end of linked list
            // if condition should be first incase what if the Linked List provided doesn't have any cycle. eg. [1] therefore check with || 2 conditons and then move slow & fast pointers
            if (fast==null  || fast.next==null)
                return false;

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
