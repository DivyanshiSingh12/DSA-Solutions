package Binary_Tree;
import java.util.*;

public class Binary_Tree_TopView {

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

    static class Info{
        Node root;
        int hd;

        public Info(Node root, int hd){
            this.root = root;
            this.hd = hd;
        }
    }

     public static void topView(Node root){

        if (root == null) {
            return; // Handle the case where the root node is null
        }

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min = 0;
        int max = 0;

        // Level Order Traversal

        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();

            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }

            else{

                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.root);
                }

                if(curr.root.left != null){
                    q.add(new Info(curr.root.left, curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.root.right != null){
                    q.add(new Info(curr.root.right, curr.hd+1));
                    max = Math.max(max,curr.hd+1);
                }

            }

            
        }
        for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();
     }
    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        topView(root);
    }
    
}
