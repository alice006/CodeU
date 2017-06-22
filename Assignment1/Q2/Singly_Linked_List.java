/**
 * Created by Alice Colt.
 *
 * Implementation of a simple Singly Linked List with integers elements
 *
 */

class Node
{
    Node next;
    int data;

    // Constructor
    public Node(int data)
    {
        this.data = data;
    }//Node constructor

}//Node class


public class Singly_Linked_List
{
    Node head;
    int size = 0;

    public void append(int data)
    {
        size++;

        // If empty, initialize the head
        if (head == null)
        {
            head = new Node(data);
            return;
        }//if


        Node current = head;
        while (current.next != null)
        {
            current = current.next;
        }//while

        current.next = new Node(data);

    }//append

    int getElement(int k)
    {
        if (head == null)
        {
            return -1;
        }//if

        // Current visited node
        Node current = head;
        int index = 0;

        while (current.next != null && index < k)
        {
            current = current.next;
            index++;
        }//while

        if(index == k)
        {
            return current.data;
        }//if

        return -1;
    }//getElement
}//Singly_List_List