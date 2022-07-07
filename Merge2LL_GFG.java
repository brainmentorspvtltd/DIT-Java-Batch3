https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1#

/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
        Node head3;
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        if(head1.data<= head2.data){
            head3 = head1;
            head1 = head1.next; // Move to the Next Node
            
        }
        else{
            head3 = head2;
            head2 = head2.next;
        }
        Node temp = head3;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next; 
            }
            else{
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next; 
            }
        }
        temp.next = head1!=null?head1: head2;
        return head3;
        
     
   } 
}
