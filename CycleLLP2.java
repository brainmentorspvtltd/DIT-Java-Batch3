/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
https://leetcode.com/problems/linked-list-cycle-ii/
public class Solution {
    
    
    public ListNode detectCycle(ListNode head) {
         if(head==null){
            return head;
        }
        if(head.next == null){
            return null;
        }
        
        ListNode slow ;
        ListNode fast;
       // slow = head;
        //fast = head.next;
        slow = fast = head;
        while(slow!=null && fast!=null && fast.next!=null){
             slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
            /*if(fast == null || fast.next==null){
                return false;
            }*/
           
        }
        if(slow == fast){
        ListNode start = head;
            //System.out.println("Slow and Fast "+ slow.val + " "+fast.val);
        while(start!=slow){
            start = start.next;
            slow = slow.next;
            //System.out.println("Loop "+start.val + " "+slow.val);
            
}
            return start;
        }
        else{
return null;
        
        }
        
        
       
    }
}
