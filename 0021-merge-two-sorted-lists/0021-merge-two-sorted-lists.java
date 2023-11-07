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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = null;
        ListNode result1 = null;

        while(list1 != null || list2 != null){
           // System.out.println("list1.val : " + list1.val);
         //   System.out.println("list2.val : " + list2.val);
            if(list1 != null && list2 != null){
                if(list1.val <= list2.val){
                  //  addToResult(list1,result,result1);
                  if(result == null){
                        result = new ListNode();
                        result.val = list1.val;
                        result1 = result;
                    //    node = node.next;
                    }else{
                        result.next = new ListNode();
                        result = result.next;
                        result.val = list1.val;
                    //    node = node.next;
                    }
                    list1 = list1.next;
                }else{
                  //  addToResult(list2,result,result1);
                   if(result == null){
                        result = new ListNode();
                        result.val = list2.val;
                        result1 = result;
                    //    node = node.next;
                    }else{
                        result.next = new ListNode();
                        result = result.next;
                        result.val = list2.val;
                    //    node = node.next;
                    }
                    list2 = list2.next;
                }
            }else if(list1 == null && list2 != null){
               // addToResult(list2,result,result1);
                if(result == null){
                        result = new ListNode();
                        result.val = list2.val;
                        result1 = result;
                    //    node = node.next;
                    }else{
                        result.next = new ListNode();
                        result = result.next;
                        result.val = list2.val;
                    //    node = node.next;
                    }
                list2 = list2.next;
            }else if(list2 == null && list1 != null){
              //  addToResult(list1,result,result1);
               if(result == null){
                        result = new ListNode();
                        result.val = list1.val;
                        result1 = result;
                    //    node = node.next;
                    }else{
                        result.next = new ListNode();
                        result = result.next;
                        result.val = list1.val;
                    //    node = node.next;
                    }
                list1 = list1.next;
            }

        }

        return result1;
        
    }

    public void addToResult(ListNode node,ListNode result,ListNode result1){
                if(result == null){
                        result = new ListNode();
                        result.val = node.val;
                        result1 = result;
                    //    node = node.next;
                    }else{
                        result.next = new ListNode();
                        result = result.next;
                    //    node = node.next;
                    }
    }
}