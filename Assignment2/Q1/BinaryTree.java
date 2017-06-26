/**
 * Created by Alice Colt.
 *
 * Implementaiton of a Binary Tree with functions for insert, serach and takeAncestors
 *
 */
public class BinaryTree {
    private NodeBinaryTree root;

    //Constructor
    public BinaryTree(NodeBinaryTree new_root){
        root = new_root;
    }


    public void insert(NodeBinaryTree new_node) {

        NodeBinaryTree actualNode = root;

        if (new_node != null) {

            while (actualNode != null) {
                if (new_node.compareTo(actualNode) == 1 && actualNode.getLeft() == null) {
                    actualNode.setLeft(new_node);
                    new_node.setParent(actualNode);
                    break;
                }//if
                else if (new_node.compareTo(actualNode) == -1 && actualNode.getRight() == null) {
                    actualNode.setRight(new_node);
                    new_node.setParent(actualNode);
                    break;
                }//else if
                else if (new_node.compareTo(actualNode) == 0) {
                    System.out.println(" The node added is a duplicate ");
                    break;
                }//else if
                else {
                    if (new_node.compareTo(actualNode) == 1) {
                        actualNode = actualNode.getLeft();
                    }//if
                    else if(new_node.compareTo(actualNode) == -1) {
                        actualNode = actualNode.getRight();
                    }//else if
                }//else
            }//while
        }//if
    }//insert


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
            if (node.getValue() > value)
                node = node.getLeft();
            else
                if (node.getValue() < value)
                    node = node.getRight();
            else
                return node;

            // Recursive search
            return search(node, value);
        }//while

        // Return node
        return node;
    }// search

}//BinaryTree class