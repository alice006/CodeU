import java.util.*;
/**
 * Created by Alice Colt.
 *
 */
public class Main {

    public static void main(String[] args) {

        BinaryTree bst = new BinaryTree(new NodeBinaryTree(16));
        // Hardcoded Test

        bst.insert(new NodeBinaryTree(9));
        bst.insert(new NodeBinaryTree(18));
        bst.insert(new NodeBinaryTree(3));
        bst.insert(new NodeBinaryTree(14));
        bst.insert(new NodeBinaryTree(19));
        bst.insert(new NodeBinaryTree(5));
        bst.insert(new NodeBinaryTree(1));

        int value = Integer.parseInt(args[0]);
        System.out.print("Ancestors for ' " + value + "' are: ");
        bst.takeAncestors(value);
        System.out.println();

    }
}