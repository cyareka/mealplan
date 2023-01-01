package com.mealplan;

// Class to construct AVL Tree
public class ProductModel {

    private Node rootNode;

    // Constructor to set null value to rootNode
    public ProductModel() {
        rootNode = null;
    }

    public void insert(String meal, String day, String time) {
        
    }

    public void delete(String meal, String day, String time) {
           if (rootNode == null)
            return;

		if (meal < rootNode.key)
			rootNode.left = deleteNode(rootNode.left, key);

		else if (key > rootNode.key)
			rootNode.right = deleteNode(rootNode.right, key);

		else
		{

			if ((rootNode.left == null) || (rootNode.right == null))
			{
				Node temp = null;
				if (temp == rootNode.left)
					temp = rootNode.right;
				else
					temp =rootNode.left;

				if (temp == null)
				{
					temp = rootNode;
					rootNode = null;
				}
				else 
					rootNode = temp;
			}
			else
			{

				Node temp = minValueNode(rootNode.right);

				rootNode.key = temp.key;

				rootNode.right = deleteNode(rootNode.right, temp.key);
			}
		}

		if (rootNode == null)
			return;

		rootNode.height = Math.max(getHeight(rootNode.left), getHeight(rootNode.right)) + 1;
    	        int balance = getBalance(rootNode);

		if (balance > 1 && getBalance(rootNode.left) >= 0)
			return rotateRight(root);

		if (balance > 1 && getBalance(rootNode.left) < 0)
		{
			rootNode.left = rotateLeft(rootNode.left);
			return rotateRight(root);
		}

		if (balance < -1 && getBalance(rootNode.right) <= 0)
			return rotateLeft(root);

		if (balance < -1 && getBalance(rootNode.right) > 0)
		{
			rootNode.right = rotateRight(rootNode.right);
			return rotateLeft(root);
		}

		return;
	}


    

    // Remove all method to make AVL Tree empty
    public void newWeek() {
        rootNode = null;
    }

    // Create getHeight() method to get the height of the AVL Tree
    private int getHeight(Node node) {
        return node == null?-1: node.height;
    }

    // Creat maxNode() to get the max height from left and right node
    private int getMaxHeight(int leftNodeHeight, int rightNodeHeight) {
        return leftNodeHeight > rightNodeHeight ? leftNodeHeight : rightNodeHeight;
    }

    // Perform rotation of binary tree node with left child
    private Node rotateLeft(Node n2) {
        Node n1= n2.left;
        n2.left = n1.right;
        n1.right = n2;

        n2.height = getMaxHeight(getHeight(n2.left), getHeight(n2.right)) + 1;
        n1.height = getMaxHeight(getHeight(n1.left), n2.height) + 1;

        return n1;
    }

    // Perform rotation of binary tree node with right child
    
}
