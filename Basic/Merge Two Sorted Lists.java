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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode r = res;
        while(l1!=null || l2!=null){
            if(l2==null || (l1!=null && l1.val<=l2.val)){
                r.next = l1;
                r = l1;
                l1 = l1.next;
            }
            else{
                r.next = l2;
                r = l2;
                l2 = l2.next;
            }
        }
        return res.next;
    }
}
