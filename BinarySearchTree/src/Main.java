import binaryTree.BinaryTree;

/**
 * Main class too test BST
 * @author Beesham Sarendranauth
 */
public class Main {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		for(int i = 1; i < 16; i++) {
			binaryTree.insert(i);
		}

		binaryTree.inOrderTraversal();

		long a = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			binaryTree.find(1);
		}
		long b = System.nanoTime() - a;
		System.out.println("Finding 1 took: " + b);

		long c = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			binaryTree.find(15);
		}
		long d = System.nanoTime() - c;
		System.out.println("Find 15 took: " + d);

		binaryTree.remove(5);
		binaryTree.inOrderTraversal();

		System.out.println("");
		binaryTree.remove(15);
		System.out.println("");
		binaryTree.inOrderTraversal();
		binaryTree.remove(1);
		System.out.println("");
		binaryTree.inOrderTraversal();
		System.out.println("");
		binaryTree.insert(2);
		binaryTree.inOrderTraversal();
		System.out.println("");


		binaryTree.clear();

		binaryTree.insert(8);
		binaryTree.insert(4);
		binaryTree.insert(12);
		binaryTree.insert(2);
		binaryTree.insert(6);
		binaryTree.insert(10);
		binaryTree.insert(14);
		binaryTree.insert(1);
		binaryTree.insert(3);
		binaryTree.insert(5);
		binaryTree.insert(7);
		binaryTree.insert(9);
		binaryTree.insert(11);
		binaryTree.insert(13);
		binaryTree.insert(15);

		binaryTree.inOrderTraversal();

		a = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			binaryTree.find(1);
		}
		b = System.nanoTime() - a;
		System.out.println("Finding 1 took: " + b);

		c = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			binaryTree.find(15);
		}
		d = System.nanoTime() - c;
		System.out.println("Find 15 took: " + d);

		binaryTree.remove(8);
		binaryTree.inOrderTraversal();
	}
}
