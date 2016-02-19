package examples;

import java.awt.geom.Ellipse2D;

public class BinaryTreeNode {
	
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public BinaryTreeNode(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
	
	public void set(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
	public void setLeft(BinaryTreeNode node)
	{
		this.left = node;
	}

	public BinaryTreeNode getLeft()
	{
		return left;
	}
	
	public void setRight(BinaryTreeNode node)
	{
		this.right = node;
	}
	public BinaryTreeNode getRight()
	{
		return right;
	}
	
	
	
	public void preOderderTraversal(BinaryTreeNode root)
	{
		if(root != null)
		{
			
			System.out.println(root.getData());
			preOderderTraversal(root.getLeft());
			preOderderTraversal(root.getRight());
			}
	}

	public void inOrderTraversal(BinaryTreeNode root)
	{
		if(root != null)
		{
			inOrderTraversal(root.left);
			System.out.println(root.getData());
			inOrderTraversal(root.right);
		}
	}
	
	public void postOrderTraversal(BinaryTreeNode root)
	{
		if(root != null)
		{
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.println(root.getData());
		}
	}

	public int maxInBinaryTree(BinaryTreeNode root)
	{
		int maxValue = 0;
		if(root != null)
		{
			int leftMax = maxInBinaryTree(root.getLeft());
			int rightMax = maxInBinaryTree(root.getRight());
			
			if(leftMax > rightMax )
			{
				maxValue = leftMax;
			}else {
				
				maxValue = rightMax;
				
			}
			
			if(root.getData() > maxValue)
			{
				maxValue = root.getData();
			}
		}
		
		return maxValue;
	}
	
}
