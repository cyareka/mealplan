package com.mealplan;

// Class to construct AVL Tree
public class ProductModel {

	private Node rootNode;

	// Constructor to set null value to rootNode
	public ProductModel() {
		rootNode = null;
	}
        //create insert to AVL tree
	public Node insert(String  meal, String day, String time) {
		rootNode = insert(meal, day, time, rootNode);
		return rootNode;	
	}

	public Node insert(String meal, String day, String time, Node node) {
		if (rootNode == null) {
			node = new Node(meal, day, time);
		} else if (getNode) {

		}

	}

	public void delete(String meal, String day, String time) {
		
	}

	// ARDE HEREEEEEEE //

	// Remove all method to make AVL Tree empty
	public void newWeek() {
		rootNode = null;
	}

	// Create getHeight() method to get the height of the AVL Tree
	private int getHeight(Node node) {
		return node == null ? -1 : node.height;
	}

	// Creat maxNode() to get the max height from left and right node
	private int getMaxHeight(int leftNodeHeight, int rightNodeHeight) {
		return leftNodeHeight > rightNodeHeight ? leftNodeHeight : rightNodeHeight;
	}

	// Perform rotation of binary tree node with left child
	// Single rotation - LL rotation - R unbalanced tree
	private Node rotateSingleLeft(Node n2) {
		Node n1 = n2.left;
		n2.left = n1.right;
		n1.right = n2;

		n2.height = getMaxHeight(getHeight(n2.left), getHeight(n2.right)) + 1;
		n1.height = getMaxHeight(getHeight(n1.left), n2.height) + 1;

		return n1;
	}

	// Perform rotation of binary tree node with right child
	// Single rotation - RR rotation - L unbalanced tree
	private Node rotateSingleRight(Node n1) {
		Node n2 = n1.right;
		n1.right = n2.left;
		n2.left = n1;

		n1.height = getMaxHeight(getHeight(n1.left), getHeight(n1.right)) + 1;
		n2.height = getMaxHeight(getHeight(n2.right), n1.height) + 1;
		return n2;
	}

	// Perform double rotation - LR rotation
	private Node rotateDoubleLeft(Node n3) {
		n3.left = rotateSingleRight(n3.left);
		return rotateSingleLeft(n3);
	}

	// Perform double rotation - RL rotation
	private Node rotateDoubleRight(Node n1) {
		n1.right = rotateSingleLeft(n1.right);
		return rotateSingleRight(n1);
	}

	public boolean searchElement(String day) {  
        return searchElement(rootNode, day);  
    }

	private boolean searchElement(Node head, String day) {  
        boolean check = false;  
        while ((head != null) && !check)  
        {  
            String headElement = head.day;  
            if (day.equalsIgnoreCase(headElement))  
                head = head.left;  
            else if (day > headElement)  
                head = head.rightChild;  
            else  
            {  
                check = true;  
                break;  
            }  
            check = searchElement(head, day);  
        }  
        return check;  
    }  
}
