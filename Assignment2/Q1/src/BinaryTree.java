import javax.xml.soap.Node;
import java.util.stream.StreamSupport;

/**
 * Created by Alice Colt.
 */
public class BinaryTree {
    private NodeBinaryTree root;


    public BinaryTree(NodeBinaryTree new_root){
        root = new_root;
    }

//    // Insert
//    public void insert(int value) {
//        //Check if root node and create one if not
////        if (root == null)
////        {
////            root = new NodeBinaryTree(value);
////        }//if
////        else {
//            //Set actual node
//            NodeBinaryTree actualNode = root;
//
//            while (actualNode != null) {
//                if (value < actualNode.getValue()) {
//                    //Insert left
//                    if (actualNode.getLeft() == null) {
//                        actualNode.setLeft(new NodeBinaryTree(value));
//
//                        return;
//                    }//if
//                    else {
//                        // Go to the left
//                        actualNode = actualNode.getLeft();
//                    }//else
//                }//if
//                else {
//                    //Insert right
//                    if (actualNode.getRight() == null) {
//                        actualNode.setRight(new NodeBinaryTree(value));
//                        return;
//                    }//if
//                    else {
//                        // Go to the right
//                        actualNode = actualNode.getRight();
//                    }//else
//                }//else
//            }//while
////        }//else
//    }//insert

    public void insert(NodeBinaryTree new_node) {

        NodeBinaryTree actualNode = root;

        if (new_node != null) {

            while (actualNode != null) {
                if (new_node.compareTo(actualNode) == 1 && actualNode.getLeft() == null) {
                    actualNode.setLeft(new_node);
                    new_node.setParent(actualNode);
                    break;
                } else if (new_node.compareTo(actualNode) == -1 && actualNode.getRight() == null) {
                    actualNode.setRight(new_node);
                    new_node.setParent(actualNode);
                    break;
                } else if (new_node.compareTo(actualNode) == 0) {
                    System.out.println(" The node added is a duplicate ");
                    break;
                }
                else {
                    if (new_node.compareTo(actualNode) == 1) {

                        actualNode = actualNode.getLeft();
                    }
                    else if(new_node.compareTo(actualNode) == -1) {

                        actualNode = actualNode.getRight();
                    }
                }
            }


        }
    }


    // Get ancestors
    public void takeAncestors(int value)
    {
        NodeBinaryTree actualNode = root;

        // Check if child is null
        if (actualNode == null) {
            System.out.println("Node null");
        }//if

        // Search Call
        actualNode = search(root, value);
        //System.out.print(actualNode.getValue());
        // Print ancestors
        while (actualNode != root)
        {
                System.out.print(actualNode.getParent().getValue() + " ");
                actualNode = actualNode.getParent();
        }//while


    }//takeAncestors

    // Function for search
    private NodeBinaryTree search(NodeBinaryTree node, int value)
    {
        while ((node != null))
        {
            if ( node.getValue() > value )
                node = node.getLeft();
            else if (node.getValue() < value)
                    node = node.getRight();
            else
                return node;
            // Recursive search
            return search(node, value);
        }
        // Return node
        return node;
    }// search

}