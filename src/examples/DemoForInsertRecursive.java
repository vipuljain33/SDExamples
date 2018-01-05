package examples;

/**
 * Created by vipuljain on 06/01/18.
 */
public class DemoForInsertRecursive {

    public static void main(String[] args)
    {
        BinaryTreeNode node = new BinaryTreeNode(50);


        node.insertRecursive(node, 10);

        node.insertRecursive(node, 20);

        node.insertRecursive(node, 60);

        node.insertRecursive(node, 70);



    }
}
