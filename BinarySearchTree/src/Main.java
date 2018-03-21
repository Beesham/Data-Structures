import binaryTree.BinaryTree;

/**
 * Main class too test BST
 * @author Beesham Sarendranauth
 */
public class Main {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(2);
		binaryTree.insert(1);
		binaryTree.insert(3);

		int a = (int) binaryTree.search(2);
	}
}
