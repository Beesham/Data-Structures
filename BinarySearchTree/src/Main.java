import binaryTree.BinaryTree;

/**
 * Main class too test BST
 * @author Beesham Sarendranauth
 */
public class Main {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(6);
		binaryTree.insert(2);
		binaryTree.insert(9);
		binaryTree.insert(1);
		binaryTree.insert(4);
		binaryTree.insert(8);
		binaryTree.insert(10);

		binaryTree.inOrderTraversal();
	}
}
