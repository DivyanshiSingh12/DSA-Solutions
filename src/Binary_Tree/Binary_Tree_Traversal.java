package Binary_Tree;
import java.util.*;
public class Binary_Tree_Traversal {
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

    //Traversal
    //Preorder Traversal
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //Inorder Trvaersal
    public static void inOrder(Node root){
        
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //postOrder Traversal
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    //LevelOrder Traversal
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);

                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }

    }




    public  static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree_Traversal tree = new Binary_Tree_Traversal();
        Node root = tree.buildTree(nodes);
        System.out.println("Preorder Trversal: ");
        preOrder(root);
        System.out.println();
        System.out.println("Inorder Trversal: ");
        inOrder(root);
        System.out.println();
        System.out.println("Postorder Trversal: ");
        postOrder(root);
        System.out.println();
        System.out.println("LevelOrder Trversal: ");
        levelOrder(root);

    }
    
    
}
