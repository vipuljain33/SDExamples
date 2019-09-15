package trees;

public class Demo {

    public static void main(String[] args)
    {
        BST bst = new BST();

        Node root = bst.insert(bst.root, 12);
        bst.insert(root, 8);
        bst.insert(root, 20);
        bst.insert(root, 4);
        bst.insert(root, 9);
        bst.insert(root, 5);
    }
}
