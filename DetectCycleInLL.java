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

https://leetcode.com/problems/linked-list-cycle/
public class Solution {
    
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        if(head.next==null){
            return false;
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
                return true;
            }
            /*if(fast == null || fast.next==null){
                return false;
            }*/
           
        }
        return false;
    }
    /*
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Boolean> visitedMap = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            ListNode ref = temp;
            if(visitedMap.get(ref)!=null){
                return true;
            }
            else{
                visitedMap.put(ref, true); // Visited Mark
            }
            temp = temp.next;
        }
        return false;
    }
    */
}
