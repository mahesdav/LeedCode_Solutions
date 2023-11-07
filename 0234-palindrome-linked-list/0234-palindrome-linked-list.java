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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
		
		ListNode sp = head;
        ListNode fp = head;
        
        while(fp!=null && fp.next!=null){
            fp=fp.next.next;
            sp=sp.next;
            
        }        

        if(fp!=null && fp.next==null)
            sp=sp.next;
        
        ListNode mid=sp;
        ListNode next=null;
        ListNode prev=null;

        while(mid!=null){
            next=mid.next;
            mid.next=prev;
            prev=mid;
            mid=next;
        }//1,2,3,2,1
        
        while(prev!=null){
            if(prev.val!=head.val)
                return false;
            
            prev=prev.next;
            head=head.next;
        }
		
		return true;
    }
}