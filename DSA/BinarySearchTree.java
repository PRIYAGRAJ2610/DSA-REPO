/*
A Binary search tree is a tree-like structure where every node has a value, and the values of the left child are smaller or equal to the current node's value, while the values of the right child are greater. This property allows for efficient searching and organizing of data.

eg :-                         50
                           /      \
			  20       80
                        /    \   /     \ 
                       10   25  70     90
                            
	now let's look at the implementation of a binary search tree .		
   */


package DSA;
public class BinarySearchTree {

    private Node root;

    // Node class 
    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }
    
	public Node getRoot() {
        return root;
    }
	
	
    // insert function
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
    private void printInOrder(Node node) {
        if (node == null) {
            return;
        }

        // Traverse the left subtree
        printInOrder(node.left);

        // Print the value of the current node
        System.out.println(node.value + " ");

        // Traverse the right subtree
        printInOrder(node.right);
    }
    public void printBST()
    {
        printInOrder(root);
    }

  

/* 
contains is a boolean function which return whether tree is containing the given value or not .
If tree has the given value it will return true else it will return false .
*/	
    
    // contains function 
    public boolean contains(int value){
        Node temp = root ;
        while(temp != null){
	// if value is smaller the node then moves to the left child node
            if(value < temp.value) {
                temp = temp.left ;
            }
	 // if value is greater than node then moves to the right child node
            else if(value > temp.value){
                temp = temp.right ;
            }
         // return true when found .
            else
            {
                return true ;
            }
        }
	// if not found return true.
        return false ;
    }

      public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);
        System.out.println("printing tree:-");
        myBST.printBST();
        System.out.println("_____________________________________________________________");
        System.out.println("                                                             ");
        System.out.println("BST Contains 27:");
        System.out.println(myBST.contains(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST.contains(17));


        /*
            EXPECTED OUTPUT:
            ----------------
            BST Contains 27:
            true
            
            BST Contains 17:
            false

        */

    }
}
