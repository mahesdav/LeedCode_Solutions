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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n<2){
            return null;
        }
        
        
        
        ListNode forwardNode=head;
        
        
        for(int i=0;i<n;i++){
            forwardNode=forwardNode.next;
        }
        
        if(forwardNode==null){
            head=head.next;
            return head;
        }
        ListNode forwardNode1=head;
        while(forwardNode.next!=null){
            forwardNode=forwardNode.next;
            head=head.next;
        }
        
        head.next=head.next.next;
        
        return forwardNode1;
    }
}