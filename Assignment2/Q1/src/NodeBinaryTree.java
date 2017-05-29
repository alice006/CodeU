import javax.xml.soap.Node;

/**
 * Created by Alice Colt.
 */
public class NodeBinaryTree<T>
{
    // Value of node
    private int value;

    // References to root, left and right

    private NodeBinaryTree root;
    private NodeBinaryTree left;
    private NodeBinaryTree right;


    // Constructor
    public NodeBinaryTree(int data)
    {
        value = data;
    }//

    public NodeBinaryTree(int data, NodeBinaryTree valueL, NodeBinaryTree valueR)
    {
        value = data;
        left = valueL;
        right = valueR;
    }


    // Getters
    public int getValue()
    {
        return value;
    }//getData


    public NodeBinaryTree getParent()
    {
        return root;
    }//getRoot


    public void setParent(NodeBinaryTree parent)
    {
        root = parent;
    }//setParent


    public NodeBinaryTree getLeft()
    {
        return left;
    }//getLeft
    public NodeBinaryTree getRight()
    {
        return right;
    }//getRight


    // Setters
    public void setData(int data)
    {
        value = data;
    }//setData

    public void setLeft(NodeBinaryTree leftChild)
    {
        left = leftChild;
    }//setLeft
    public void setRight(NodeBinaryTree rightChild)
    {
        right = rightChild;
    }//setRight


    public int compareTo(NodeBinaryTree node2) {
        int value1 = this.getValue();
        int value2 = node2.getValue();

        if (value1 > value2)
            return -1;
        else if (value1 < value2)
            return 1;
        else
            return 0;
    }

}