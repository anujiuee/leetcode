/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next==null) return head;
        
        ListNode first = head;
        ListNode second = head;
        ListNode prev = head;
        
        while(second!=null && second.next!=null){
            prev = first;
            first = first.next;
            second = second.next.next;
        }
        
       ListNode mid = prev.next;
        
        prev.next = null;
        
        ListNode a = sortList(head);
        
        ListNode b = sortList(mid);
        
        
        
        return mergesort(a,b);
        
        
        
    }
    
    public ListNode mergesort(ListNode first,ListNode second){
        
        ListNode head = new ListNode(0);
        
        ListNode temp = head;
        
        while(first!=null && second!=null){
            if(first.val<second.val){
                head.next = first;
                first = first.next;
            }
            else {
                head.next = second;
                second = second.next;
            }
            
            head = head.next;
        }
        
        if(first==null){
            head.next = second;
        } else {
            head.next = first;
        }
        
        return temp.next;
    }
    
    
    
}
