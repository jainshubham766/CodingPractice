Qustion:  https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

Solution: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/discuss/1953251/Simple-java-solution

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
    public int getDecimalValue(ListNode head) {
        //Brute Force Approach
        //LInkedList --> String--> Integer(Decimal Value)
//         String binary = "";
//         while (head!=null){
//             binary += head.val;
//             head=head.next;
//         }
//         return Integer.parseInt(binary,2);


        int sum = 0;

        while (head!=null){
            sum*= 2;
            sum+=head.val;
            head=head.next;
        }

        return sum;

    }
}
