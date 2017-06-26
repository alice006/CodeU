/**
 * Created by Alice Colt.
 *
 * Implementaiton of a Binary Tree with functions for insert, search and takeAncestors and commonAncestors
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


/*
*
*   A more complicated method
*   Takes the node with the smallest value
*   Work the way up, searching for the second node
*   It keeps track of the common ancestor
*
    public int commonAncestor1(int value1, int value2)
    {
        NodeBinaryTree currentNode;
        NodeBinaryTree currentParent;

        if(value1 < value2)
        {
            currentNode = search(root, value1);
        }//if
        else
        {
            currentNode = search(root, value2);
        }//else

        NodeBinaryTree copyParent = currentNode.getParent();
        currentNode = currentNode.getParent();

        if(currentNode.getValue() == value2)
        {
            return currentNode.getParent().getValue();
        }//if

        copyParent = currentNode.getParent();

        while(currentNode != root)
        {
            if(currentNode.getValue() == value2)
            {
                return currentNode.getParent().getValue();
            }
            else
                if(currentNode == root)
                    return root.getValue();
                else
                {
                    if(currentNode.getValue() > value2)
                    {
                        copyParent = currentNode;
                        currentNode = currentNode.getRight();
                    }
                    else
                    {
                        copyParent = currentNode;
                        currentNode = currentNode.getLeft();
                    }
                }
        }
        return copyParent.getValue();
    }//commonAncestor
*/

    // Lowest Common Ancestor
    public int commonAncestor(int value1, int value2)
    {
        NodeBinaryTree currentNode = root;

        while(true)
            if(value1 < currentNode.getValue() && value2 < currentNode.getValue())
                currentNode = currentNode.getLeft();
            else
                if(value1 > currentNode.getValue() && value2 > currentNode.getValue())
                    currentNode = currentNode.getRight();
                else
                    return currentNode.getValue();
    }//commonAncestor

}//BinaryTree class