import java.util.LinkedList;
import java.util.Scanner;

// class Node{
//     int data; // Node Data Part
//     Node next; // Node Reference / Next Node Reference Store Here

//     // Constructor
//     Node(int data){
//         this.data = data;
//         next = null;
//     }

// }

class DoublyNode<T>{
    T data;
    Node<T> prev;
    Node<T> next;
}

class CircularNode<T>{
    T data;
    
    Node<T> next; // next contains the address of start node.
}


class Node<T> {
    T data; // Node Data Part
    Node<T> next; // Node Reference / Next Node Reference Store Here

    // Constructor
    Node(T data){
        this.data = data;
        next = null;
    }

}

class LinkedListOperations<T>{

    // We Need a Start Pointor (Reference of the First Node)
    Node<T> start; // default it is initalize with null
    Node<T> tail;
    void print(){
        Node<T> temp = start; // Point to the first node
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void deleteAtMid(int pos){
        if(start == null){
            System.out.println("LL is Empty ....");
            return ;
        }
        if(start.next == null){
            // Single node
            start = null;
            return ;
        }
        Node<T> temp = start;
        Node<T> temp2 = start;
        for(int i = 1; i<pos-1; i++){
            temp = temp.next;
            temp2 = temp;
        }
        temp2 = temp2.next;
       
        temp.next = temp.next.next;
        temp2.next = null; // GC Eligable
       
    }

    void deleteAtEnd(){
        if(start == null){
            System.out.println("LL is Empty ....");
            return ;
        }
        if(start.next == null){
            // Single node
            start = null;
            return ;
        }
        Node<T> temp = start;
        Node<T> temp2 = start;
        while(temp.next != null){
            temp2 = temp;
            temp= temp.next; 
        }
        temp2.next = null;
        temp = null;
    }

    void deleteAtBeg(){
        if(start == null){
            System.out.println("LL is Empty ....");
            return ;
        }
        if(start.next == null){
            // Single node
            start = null;
            return ;
        }
        Node<T> temp = start;
        start = start.next; // Move to the Next Node
        temp.next = null;
        temp = null;
    }

    void middle(){
        Node<T> slow = start;
        Node<T> fast = start;
        if(start == null){
            System.out.println("LL is Empty");
            return;
        }
        // Even List fast!=null
        // Odd List 
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow=slow.next;
        }
        System.out.println("MId " + slow.data);
    }
    int len(){
        Node<T> temp = start;
        int counter= 0;
        while(temp!=null){
            temp = temp.next;
            counter++;
        }
        return counter;
    }
    void kthNodeApproach1(){
        // Compute Len of LL
        int n= len();
        int k = 2;
        int x = (n-k+1);
        Node<T> temp = start;
        for(int i = 1; i<=x; i++){
                temp = temp.next;
        }
        System.out.println("Kth  Node data is "+temp.data);
    }

    void kthNodeApproach2(){
        Node<T> p = start;
        Node<T> n = start;
        int k = 2;
        for(int i = 1; i<=k; i++){
            n = n.next;
        }
        while(n!=null){
            p = p.next;
            n = n.next;
        }
        System.out.println("Kth Node Data is "+p.data);
    }



    void addAtBeg(Node<T> node){
            if(start == null){
                start = node;
            }
            else{
                node.next = start;
                start = node;
            }
    }

    void addAtMiddle(Node<T> node, int position){
        // if position it is 0 add at Beg
        // reach till position then add it.
        if(position == 0){
            addAtBeg(node);
            return ;
        }
        Node<T> temp = start; // Start from start
        int i = 1;
        while(i<position){
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
    }
    
    // add New node in a LL
    void addAtEnd(Node<T> node){
        if(start == null){
            // It means linked list is Empty
            tail = start = node; // node reference will be copy to the start node
        }
        else{
            tail.next  = node;
            tail = node;
        }
       /* 
        if(start == null){
            // It means linked list is Empty
            start = node; // node reference will be copy to the start node
        }
        else{
            // If LL is Not Empty 
            Node<T> temp = start; // first node reference copy to the temp node
            // temp node is pointing to the first node.
            while(temp.next!=null){
                temp = temp.next; // Traverse Node by Node
            }
            temp.next = node;
        }
        */
    }
}

// class Employee{

// }
class LinkedListDemo{
    public static void main(String[] args) {
        //Node<int> node4 = new Node(100);
            //Node<String> node = new Node("Amit");
            //Node<Integer> node2 = new Node(100);
            //Node<Employee> node3 = new Node(new Employee());
           Scanner scanner = new Scanner(System.in);
            LinkedListOperations<Integer> opr = new LinkedListOperations<>();
            while(true){
            System.out.println("1. Add a New Node at End in LL");
            System.out.println("2. Print LL ");
            System.out.println("3. Add at Beg in LL");
            System.out.println("4. Add Position Wise in LL");
            System.out.println("5. Delete at Beg ");
            System.out.println("6. Delete at End ");  
            System.out.println("7. Delete at Middle"); 
            System.out.println("8. Middle Node "); 
            System.out.println("9. Kth Node ");

            System.out.println("10. Exit");
            System.out.println("Enter the Choice ");
            int choice = scanner.nextInt();
            int data ; 
            Node<Integer> node;
            int pos;
            switch(choice){
                case 1:
                    System.out.println("Enter the Data for the Node....");
                     data= scanner.nextInt();
                    node = new Node<>(data);
                    opr.addAtEnd(node);
                    break;
                    case 3:
                    System.out.println("Enter the Data for the Node....");
                     data= scanner.nextInt();
                     node = new Node<>(data);
                    opr.addAtBeg(node);
                    break;
                    case 4:
                    System.out.println("Enter the Data for the Node....");
                     data= scanner.nextInt();
                     System.out.println("Enter the Position...");
                      pos = scanner.nextInt();

                     node = new Node<>(data);
                    opr.addAtMiddle(node, pos);
                    break;

                    case 5:
                    opr.deleteAtBeg();
                    break;

                    case 6:
                    opr.deleteAtEnd();
                    break;
                    case 7:
                    System.out.println("Enter the Position...");
                    pos = scanner.nextInt();
                    opr.deleteAtMid(pos);
                    break;

                    case 8 :
                    opr.addAtEnd(new Node<Integer>(10));
                    opr.addAtEnd(new Node<Integer>(20));
                    opr.addAtEnd(new Node<Integer>(120));
                    opr.addAtEnd(new Node<Integer>(30));
                    opr.addAtEnd(new Node<Integer>(220));
                    opr.middle();
                    break;

                    case 9:
                    opr.kthNodeApproach1();
                    opr.kthNodeApproach2();
                    break;

                case 2:
                   opr.print();
                   break;
                 case 10:
                 return ;   


           }
        } 
    }
}