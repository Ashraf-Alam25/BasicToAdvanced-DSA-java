//import java.util.*;

public class AddLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    // add first method
    public void addFirst(int data){  // T.C = O(1)
        // first of all create new node
        Node newNode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 newNode next = head
        newNode.next = head;
        //step 3 head = newNode
        head = newNode;
    }
    
    //add in last method
    public void addLast(int data){   // T.C = O(1)
        Node newNode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
            return;   
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    // print method
    public void print(){   // T.C = O(n)
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println("null ");
    }
    // method for any where
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size ++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        AddLinkedList ll = new AddLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.add(1,20);
        ll.print();
        System.out.println(AddLinkedList.size);
    }
}
