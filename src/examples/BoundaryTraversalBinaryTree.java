package examples;

/**
 * Created by vipuljain on 30/03/18.
 */
public class BoundaryTraversalBinaryTree {

    BTNode root ;

    public static void main(String[] args)
    {

        BoundaryTraversalBinaryTree boundaryTraversal = new BoundaryTraversalBinaryTree();
        boundaryTraversal.root = new BTNode(50);
        boundaryTraversal.root.left = new BTNode(20);
        boundaryTraversal.root.right = new BTNode(80);

    }
}
