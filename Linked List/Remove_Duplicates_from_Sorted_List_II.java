/*Question: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/*/

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
    public ListNode deleteDuplicates(ListNode head) {

        //Method 01

//     int pos[] = new int [101];
//      int neg[] = new int [101];
//        ListNode temp = head;
//         while(temp!=null){
//            if (temp.val >= 0) {
//                pos[temp.val] ++;
//            }else {
//                neg[(-1*temp.val)]++;
//            }
//             temp = temp.next;

//         }

//         ListNode result = new ListNode(0);
//         head=result;
//         for (int i=100;i>0;i--){
//             if (neg[i]==1){
//                 ListNode curr = new ListNode((-1*i));
//                 result.next= curr;
//                 result= result.next;
//             }
//         }
//         for (int i=0;i<101;i++){
//             if (pos[i]==1){
//                 ListNode curr = new ListNode(i);
//                 result.next= curr;
//                 result= result.next;
//             }
//         }

//         return head.next;
        if (head==null  ||  head.next==null) return head;

        ListNode list =  new ListNode();

        ListNode temp =  head , newhead=list;

         while (temp!=null){
             ListNode curr = temp;
             temp=temp.next;
             while (temp!=null &&  temp.val==curr.val){
                 temp=temp.next;
             }
             if (curr.next==temp){
                 ListNode ptr = new ListNode(curr.val);
                 list.next=ptr;
                 list=list.next;
             }
         }

        return newhead.next;
    }
}

/*
// In second approach inside a while loop pick each  elemnet and check for he continunity of the duplicate if exit drop thet element and move ahead...Note keep the track of head;
// */
