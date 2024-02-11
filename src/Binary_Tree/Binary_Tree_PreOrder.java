package Binary_Tree;
import java.util.*;

public class Binary_Tree_PreOrder {

    public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int idx = -1;

    public Node buildTree(int nodes[]){
       idx = idx+1;
       if(nodes[idx]==-1){
        return null;
       }
       Node newNode = new Node(nodes[idx]);
       newNode.left = buildTree(nodes);
       newNode.right = buildTree(nodes);

       return newNode;



    }



    public  static void main(String args[]){
        int nodes[] = {89,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree_PreOrder tree = new Binary_Tree_PreOrder();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

    }
    
}
