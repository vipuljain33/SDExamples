package examples;

import java.awt.geom.Ellipse2D;
import java.util.LinkedList;
import java.util.Queue;

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

	public void levelOrderTraversal(BinaryTreeNode root)
	{
		Queue<BinaryTreeNode> queue = new LinkedList<>();

		queue.add(root);

		while(!queue.isEmpty())
		{
			BinaryTreeNode temp = queue.poll();
			System.out.println(temp.data);

			if(temp.left != null)
			{
				queue.add(temp.left);
			}

			if(temp.right != null)
			{
				queue.add(temp.right);
			}

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

	public int height(BinaryTreeNode root)
	{

		if(root == null)
		{

			return 0;
		}else
		{
			int lheight = height(root.left);
			int rheight = height(root.right);

            /* use the larger one */
			if (lheight > rheight)
				return(lheight+1);
			else
				return(rheight+1);



		}


	}

	public BinaryTreeNode insert(BinaryTreeNode root, int data)
	{
		Queue<BinaryTreeNode> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty())
		{
			BinaryTreeNode temp = queue.poll();

			if(temp != null)
			{
				if(temp.left != null)
				{
					queue.add(temp.left);
				}else
				{
					temp.left = new BinaryTreeNode(data);
					System.out.println("Node added in left sub tree");
					return root;
				}

				if(temp.right != null)
				{
					queue.add(temp.right);
				}else
				{
					temp.right = new BinaryTreeNode(data);
					System.out.println("Node added in right sub tree");
					return root;
				}
			}
		}
		return root;
	}

	public void insertRecursive(BinaryTreeNode root, int data) {

		if(root.data > data)
		{
			//insert in left subtree
			if(root.left == null)
			{
				root.left = new BinaryTreeNode(data);
				System.out.println(data +" Inserted in left subtree of " + root.data);
			}else
			{
				insertRecursive(root.left, data);
			}
		}else
		{
			//insert in right subtree
			if(root.right == null)
			{
				root.right = new BinaryTreeNode(data);
				System.out.println(data + " Inserted in right subtree of "+ root.data);
			}else
			{
				insertRecursive(root.right, data);
			}
		}


	}


	}
	

