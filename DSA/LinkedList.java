package DSA;
public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        // constructor for node class .
        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    // method to print values of linkedlist .
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    
    // append method to add a node at last of the LL .
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // to remove the last element/node from the LL .
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    
    
    // method to add element/Node at starting of the LL.
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // method to remove first element/Node form LL .
	public Node removeFirst()
	{
	    if(length == 0 )
	    {
	        return null ;
	    }
	    Node temp = head;
	    head = head.next;
	    temp.next = null;
	    length--;
	    if(length==0){
	        tail = null ;
	    }
	    return temp ; 
	}
	
	
	public static void main(String[] args)
	{

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);
        myLinkedList.prepend(0);
        myLinkedList.printList();
        System.out.println("                                                 ");
        System.out.println("------------------------------------------------");
        myLinkedList.printAll();
        System.out.println("------------------------------------------------");
        System.out.println("                                                 ");
       
        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println("                                                 ");
        System.out.println("After removing all the elements.");
        myLinkedList.printAll();

    }
}

