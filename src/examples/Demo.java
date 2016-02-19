package examples;

public class Demo {

	public static void main(String[] args) {
		
		
		BinaryTreeNode node = new BinaryTreeNode(5);
		node.setLeft(new BinaryTreeNode(10));
		int data = node.getData();
		System.out.println(data);
		data = node.getLeft().getData();
		System.out.println(data);
		node.setRight(new BinaryTreeNode(15));
		data = node.getRight().getData();
		System.out.println(data);
		node.getLeft().setLeft(new BinaryTreeNode(20));
		data = node.getLeft().getLeft().getData();
		System.out.println(data);
		node.getRight().setRight(new BinaryTreeNode(30));
		data = node.getRight().getRight().getData();
		System.out.println(data);
		
		System.out.println("Preorder Traversal Results are :-");
		node.preOderderTraversal(node);
		System.out.println("Inorder Traversal Results are :-");
		node.inOrderTraversal(node);
		
		System.out.println("Postorder Traversal results are");
		node.postOrderTraversal(node);
		
		System.out.println("Max value in Binarytree");
		int maxvalue = node.maxInBinaryTree(node);
		System.out.println("Max value in binary tree = " + maxvalue);
		
		
		

	}

}
