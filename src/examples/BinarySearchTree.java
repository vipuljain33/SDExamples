package examples;

/**
 * Created by vipuljain on 29/12/17.
 */
public class BinarySearchTree {


    Node root;
    class Node{
        int data;
        Node left;
        Node right;
    }

    public Node insert(Node root, int data)
    {
        if(root == null)
        {
            root = new Node();
            root.data = data;
            return root;
        }

        if(data < root.data)
        {
            System.out.println("Inserting in left subtree");
            root.left = insert(root.left, data);
            System.out.println(root.left.data);
        }else if(data > root.data)
        {
            System.out.println("Inserting in right subtree");
            root.right = insert(root.right, data);
            System.out.println(root.right.data);
        }
        return root;
    }

    public Node search(Node root, int data)
    {
        if(data == root.data)
        {
            return root;
        }

        if(data < root.data)
        {
            search(root.left, data);
        }else if(data > root.data)
        {
            search(root.right, data);
        }


        return root;
    }





    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();
        Node root= bst.insert(bst.root, 10);
        bst.insert(root, 20);
        bst.insert(root, 5);

        Node temp = bst.search(root, 20);
        System.out.println(temp.data);



    }
}
