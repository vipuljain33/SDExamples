package trees.com.vipul.bst;

import java.util.Comparator;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;


    @Override
    public void insert(T data)
    {
        if(root == null)
        {
            root = new Node<T>(data);
        }else
        {
            insertNode(data, root   );
        }
    }


    public T getMinValue()
    {
        if(root == null)
        {
            return null;
        }

        return getMin(root);
    }

    public T getMaxValue()
    {
        if(root ==null)
        {
            return null;
        }

        return getMax(root);
    }

    public void inorder(Node<T> root)
    {
        if(root.getLeftChild() != null)
        {
            inorder(root.getLeftChild());
        }

        System.out.print(root+ " --> ");

        if(root.getRightChild() != null)
        {
            inorder(root.getRightChild());
        }

    }




    @Override
    public void traversal() {

        if(root != null)
        {
            inorder(root);
        }

    }



    private void insertNode(T data, Node<T> root ) {

        if(data.compareTo(root.getData())< 0)
        {
            if(root.getLeftChild() != null)
            {
                insertNode(data, root.getLeftChild());
            }else
            {
                Node<T> newNode = new Node<T>(data);
                root.setLeftChild(newNode);
            }

        }else
        {
            if(data.compareTo(root.getData())> 0)
            {
                if(root.getRightChild() != null) {
                    insertNode(data, root.getRightChild());
                }else
                {
                    Node<T> newNode = new Node<T>(data);
                    root.setRightChild(newNode);

                }
            }
        }

    }

    @Override
    public void delete(T data) {

    }


    private T getMax(Node<T> node) {

        if(root.getRightChild() != null)
        {
            return getMax(root.getRightChild());
        }

        return root.getData();
    }


    private T getMin(Node<T> root) {

        if(root.getLeftChild() != null)
        {
             return getMin(root.getLeftChild());
        }

        return root.getData();
    }
}
