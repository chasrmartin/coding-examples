/* Simple example of a binary tree in Java */

class Node {
    Node left;
    Node right;
    int data ;

    Node(Node left, Node right, int data){
        this.left  = left;
        this.right = right;
        this.data  = data;
    }

    public void setLeft(Node left){
        this.left = left;
    }
    public void setRight(Node right){
        this.right = right;
    }
    public Node getLeft(){
        return this.left ;
    }
    public Node getRight(){
        return this.right ;
    }

    public int getData(){
        return this.data;
    }
}

public class Search {

    Node root;

    public static void preOrder(Node root){

        System.out.printf(" %d ", root.getData());

        if(root.getLeft() != null)
            inOrder(root.getLeft());

        if(root.getRight() != null)
            inOrder(root.getRight());
    }
    public static void inOrder(Node root){
        if(root.getLeft() != null)
            inOrder(root.getLeft());

        System.out.printf(" %d ", root.getData());

        if(root.getRight() != null)
            inOrder(root.getRight());
    }
    public static void postOrder(Node root){
        if(root.getLeft() != null)
            inOrder(root.getLeft());

        if(root.getRight() != null)
            inOrder(root.getRight());

        System.out.printf(" %d ", root.getData());
    }
    
    public static void main(String[] argv){
        System.out.println("Started...");

        // create an interesting tree
        Node five  = new Node(null, null, 5);
        Node four  = new Node(null, null, 4);
        Node three = new Node(four, five, 3);
        Node two   = new Node(null, null, 2);
        Node one   = new Node(two, three, 1);

        System.out.println("\npre-order traversal");
        preOrder(one);
        System.out.println("\nin-order traversal");
        inOrder(one);
        System.out.println("\npost-order traversal");
        postOrder(one);
        System.out.println();
        

        System.out.println("Done.");
    }
}
            
