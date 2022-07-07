https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1#


class gfg
{
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
             // Mid of the LL
             Node start = list.head;
             Node slow, fast;
             slow = fast = start;
             while(fast.next!=start && fast.next.next!=start){
                 fast = fast.next.next;
                 slow = slow.next;
             }
             if(fast.next.next== start){
                 fast = fast.next;
             }
             list.head1 = start;
             if(start.next!=start){
                 list.head2 = slow.next;
             }
             fast.next = slow.next;
             slow.next = start;
             
	 }
}
