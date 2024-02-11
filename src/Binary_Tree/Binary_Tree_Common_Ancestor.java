package Binary_Tree;
import java.util.*;

import org.w3c.dom.Node;

public class Binary_Tree_Common_Ancestor {

    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }

    public static Node commonAncestor(Node root, int n1, int n2 ){

        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftlca = commonAncestor(root.left, n1, n2);
        Node rightlca = commonAncestor(root.right, n1, n2);

        if(rightlca == null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }

        return root;
    }
     
        
     public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(commonAncestor(root,4, 5).data +" ");
        
        
    }

}