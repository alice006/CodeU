import java.util.Scanner;
/**
 * Created by Alice Colt.
 *
 * Implement an algorithm to find the Kth to last element of a singly linked list.
 *
 */
public class Main
{
    public static void main(String[] args)
    {
        Singly_Linked_List list = new Singly_Linked_List();

        for (int index = 0; index<20; index++)
        {
            list.append(index);
        }//for

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kth element: ");
        int k = scanner.nextInt();

        if (list.size == 0)
        {
            System.out.println("List is empty!");
            return;
        }//if

        int element = list.getElement(list.size - 1 - k);
        if (element == -1)
        {
            System.out.println("The " + k + "th element is not in the List. Size smaller than the kth element.");
        }//if
        else
        {
            System.out.println("The " + k + "th element in the LinkedList is: " + element);
        }//else

    }//main
}//Main class


