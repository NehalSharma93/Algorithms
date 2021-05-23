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
        if(head==null || head.next==null)
            return head;
        if(head.next.next==null)
            return head.next;
        ListNode p = head.next;
        ListNode q = head.next.next; 
        while(p.next!=null && q.next!=null && q.next.next!=null){
            p = p.next;
            q = q.next.next;
        }
        if(q.next!=null)
            return p.next;
        return p;
    }
}
