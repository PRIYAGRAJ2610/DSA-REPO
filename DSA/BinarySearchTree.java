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
    
    // contains function 
    public boolean contains(int value){
        Node temp = root ;
        while(temp != null){
            if(value < temp.value) {
                temp = temp.left ;
            }
            else if(value > temp.value){
                temp = temp.right ;
            }
            else
            {
                return true ;
            }
        }
        return false ;
    }
}