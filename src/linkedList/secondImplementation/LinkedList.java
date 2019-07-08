package linkedList.secondImplementation;

/**
 * Created by vipuljain on 14/07/18.
 */
public class LinkedList {

    int length ;
    Node head;

    public LinkedList()
    {
        length = 0;
    }

    public void insertAtHead(Node node)
    {
        if(head == null)
        {
            head = node;
        }else {
            node.next = head;
            head = node;
            length++;
        }
    }

    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        Node n = new Node(10);
        ll.insertAtHead(n);
        Node n1 = new Node(20);
        ll.insertAtHead(n1);


    }
}
