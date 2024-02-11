package LinkedList;
import java.util.*;

public class Linked_List_Pallindrome {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean checkPallindrome(Node head){
        //Find middle element using slow-fast approach
        Node slow = head;
        Node fast = head;

        if(head==null || head.next == null){
            return true;
        }

        while(fast!=null ){
            fast = fast.next.next;
            slow = slow.next;
        }

        //Reverse the right half of the LL
        Node curr = slow;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            prev = curr;
            curr = next;
        }


        //Check if the First half is equal to  the second halves
        Node right = curr;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }

    public static Node addLast(int data, Node head) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return head;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        return head; // Return the updated head

    }

    public static void printll(Node head){
        Node temp = head;
        if(head==null){
            System.out.println("There are no elements to print");
        }

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

        System.out.println("null");

    }

    public static void main(String args[]) {
        Linked_List_Pallindrome ll = new Linked_List_Pallindrome();
        Node head = null; // Initialize the head to null

        
        head = addLast(1, head);
        head = addLast(2, head);
        head = addLast(3, head);
        head = addLast(4, head);
        head = addLast(2, head);
        head = addLast(1, head);
        
        System.out.println(checkPallindrome(head));
    }

}
