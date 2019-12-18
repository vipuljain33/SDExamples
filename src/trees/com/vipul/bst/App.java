package trees.com.vipul.bst;

public class App {

    public static void main(String[] args)
    {
        Tree<Integer> bst =  new BinarySearchTree<>();

        bst.insert(50);
        bst.insert(20);
        bst.insert(12);
        bst.insert(34);
        bst.insert(23);
        bst.insert(70);
        bst.insert(77);
        bst.insert(65);
        bst.traversal();


        //System.out.println(bst.getMinValue());
    }
}
