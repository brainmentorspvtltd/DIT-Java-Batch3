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

https://leetcode.com/problems/palindrome-linked-list

class Solution {
    private ListNode reverse(ListNode currentNode, ListNode prevNode){
        if(currentNode == null){
            return prevNode; // Last Node (Become Start/ Head)
        }
        ListNode ahead = currentNode.next;
        currentNode.next = prevNode;
        return reverse(ahead, currentNode );
        
    }
    private boolean compare(ListNode firstHalf, ListNode secondHalf){
        while(firstHalf!=null && secondHalf!=null){
            if(firstHalf.val == secondHalf.val){
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        // Mid Node
        // Reverse 2nd Half of the LL
        // Split Compare 2 List 
        // Reverse 2nd Half (Org List)
        // Step - 1 Mid Node Find out
        // List Contains One Node
        if(head.next == null){
            return true; 
        }
        ListNode slow , fast;
        ListNode midNode = null;
        ListNode prevNode = null;
        slow = fast = head;
        
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prevNode = slow;
            slow = slow.next;
        }
       
        // Odd Length List
        if(fast!=null){
            midNode = slow; // Place at Mid
            slow = slow.next; // Mid + 1 (Move to next)
        }
        
        // Create SecondHalf of the List
        ListNode secondHalf = slow;
        // Create the First Half Here
        prevNode.next = null; 
        // reverse the Second Half
        secondHalf = reverse(secondHalf, null);
        // Compare the First Half with the Second Half
        boolean result = compare(head, secondHalf);
        // Undo the Reverse
        secondHalf = reverse(secondHalf, null);
        // Recreate the Org List
        if(midNode!=null){
            prevNode.next = midNode;
            midNode.next = secondHalf;
        }
        return result;
        
        
        
    }
}
