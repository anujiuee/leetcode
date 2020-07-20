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
    public ListNode removeElements(ListNode temp, int val) {
        
        ListNode head = temp;
        if(head==null) return null;
        if(head.next==null && head.val==val) return null;
        
        while(head!=null && head.next!=null){
          if(head.next.val == val ) head.next = head.next.next;
           else  head= head.next;
        }
       if(temp.val==val) return temp.next;

        return temp;
        
    }
}