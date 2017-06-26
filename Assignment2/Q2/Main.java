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


        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);

        System.out.print("Lowest Common Ancestors for ' " + value1 + "' and '" + value2 + "' is: ");
        int x = bst.commonAncestor(value1, value2);
        System.out.println(x);
    }
}