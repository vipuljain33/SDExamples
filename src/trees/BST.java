package trees;

public class BST {

    Node root;


    public Node insert(Node root, int data)
    {

        if(root == null)
        {
            root = new Node(data);

        }else if (data < root.data)
        {
            System.out.println("Inserting in left subtree");
            root.left = insert(root.left, data);



        }else
        {
            System.out.println("Inserting in right subtree");

            root.right = insert(root.right, data);


        }

        return root;
    }
}
