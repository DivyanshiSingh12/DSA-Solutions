package Binary_Tree;
import org.w3c.dom.Node;

public class Binary_Tree_MinimumPossibleDis {

    public static  class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
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

    public static int distance(Node root, int n){

        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftdis = distance(root.left, n);
        int rightdis = distance(root.right,n);

        if(leftdis==-1 && rightdis == -1){
            return -1;
        }else if(rightdis==-1){
            return leftdis+1;
        }else{
            return rightdis+1;
        }


    }

    public static int minimumDistance(Node root, int n1, int n2){

        Node mNode = commonAncestor(root, n1, n2);
        int dis1 = distance(mNode,n1);
        int dis2 = distance(mNode, n2);
        
        int final_distance = dis1 + dis2;
        return final_distance;
    }
     

    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(minimumDistance(root,4, 3));
        
        
    }
    
}
