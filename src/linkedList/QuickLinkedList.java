package linkedList;

/**
 * Created by vipuljain on 14/07/18.
 */
public class QuickLinkedList {

    class Node{
        int data;
        Node next;
    }

    Node head;

    public void insertAtHead(Node head, int data)
    {
        if(this.head == null)
        {
            this.head = new Node();
            this.head.data = data;

        }else
        {
            Node temp = new Node();
            temp.next = head;
            temp.data = data;
            this.head = temp;


        }
    }

    public static void main(String[] args)
    {

        QuickLinkedList ll = new QuickLinkedList();
        ll.insertAtHead(ll.head, 4);
        ll.insertAtHead(ll.head, 10);
    }
}
