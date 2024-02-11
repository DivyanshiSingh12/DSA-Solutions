package Binary_Tree;
public class Binary_Tree_Operations {



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

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        int final_height = Math.max(leftheight, rightheight)+1;
        return final_height;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int left_count = countNodes(root.left);
        int right_count = countNodes(root.right);

        return left_count + right_count + 1;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);

        return leftsum+rightsum+root.data;
    }



    public  static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree_Operations tree = new Binary_Tree_Operations();
        Node root = tree.buildTree(nodes);
        //Height of a Tree
        System.out.println("Height of the tree is"+" "+height(root));
        //Number of Nodes
        System.out.println("The number of nodes are"+ " "+countNodes(root));
        //Sum of Nodes
        System.out.println("The sum of nodes is"+" "+sumOfNodes(root));

    }
    


}
