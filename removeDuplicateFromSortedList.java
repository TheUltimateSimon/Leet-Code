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
        // In case of empty list
        if(head == null) {
            return head;
        }

        // If next is null, then you meet the end of the list.
        else if(head.next == null)
        {
            return head;
        }
        // If next node and current has same value.
        else if(head.val == head.next.val)
        {
            // If the one after next is null, just remove the next node.
            if(head.next.next == null)
            {
                ListNode x = null;
                head.next = x;
                return head;
            }
            // Replace the new node to the head and check the same node. 
            else {
                ListNode y = head.next.next;
                head.next = y;
                deleteDuplicates(head);
            }
        }

        // Go to the next node and return the newest node.
        deleteDuplicates(head.next);
        return head;
    }
}
