package others;
public class TernarySearchTree {
    public static void main(String[] args) {

        Node node = new Node();

    }

    public void insert(Node root, int value) {
        if (root == null) {
            root.setData(value);
        } else {
            if (root.getData() == value) {
                insert(root.getMidChild(), value);
            } else if (root.getData() >= value) {
                insert(root.getLeftChild(), value);
            } else {
                insert(root.getRightChild(), value);
            }
        }
    }

    public void delete(Node root, int value) {
        if (root == null) {
            System.out.println("Empty tree");
        } else if (root.getLeftChild() == null || root.getMidChild() == null || root.getRightChild() == null) {
            System.out.println("Removed " + root.getData());
        } else {
            if (root.getData() == value) {
                delete(root.getMidChild(), value);
            } else if (root.getData() >= value) {
                delete(root.getLeftChild(), value);
            } else {
                delete(root.getRightChild(), value);
            }
        }
    }

    public void print(Node root) {
        if (root != null) {
            print(root.getLeftChild());
            System.out.println(root.getData());
            print(root.getMidChild());
            System.out.println(root.getData());
            print(root.getRightChild());
        }
    }
}

class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;
    private Node midChild;

    public void Node() {
        data = 0;
        leftChild = null;
        rightChild = null;
        midChild = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getMidChild() {
        return midChild;
    }

    public void setMidChild(Node midChild) {
        this.midChild = midChild;
    }

}
