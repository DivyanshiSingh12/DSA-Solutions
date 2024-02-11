package LinkedList;
import java.util.*;

public class Linked_List_ZigZac {
    
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node findMid(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void zigZac(Node head){
        //Midpoint

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node Midpoint = slow;

        //Reversing the second half
        Node curr = Midpoint.next;
        Midpoint.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Merging the lists in ZigZac Manner

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next =nextL;

            left = nextL;
            right = nextR;
        }
    }
    
    public static void addLast(int data, Node head) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } 

            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
    

        return head;
    }

    public static void printll(Node head){

        if(head==null){
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }


    }

    public static void main(String args[]){
        Linked_List_ZigZac ll = new Linked_List_ZigZac();
        Node head = null;
        ll.addLast(1, head);
        ll.addLast(2, head);
        ll.addLast(3, head);
        ll.addLast(4, head);
        ll.addLast(5, head);

        printll(head);

        

        
    }
}
