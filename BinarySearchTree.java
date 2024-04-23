public class BinarySearchTree {
    
    private Node root;

    public void Insert(int data) {
        Node newNode = new Node(data);
        root = RecursiveInsert(root, newNode);
    } 

    private Node RecursiveInsert(Node root, Node newNode) {
        if(root == null) {
            root = newNode;
            return root;
        } else if(newNode.data >= root.data) { //begins comparisons
            root.right = RecursiveInsert(root.right, newNode);
        } else {
            root.left = RecursiveInsert(root.left, newNode);
        }

        return root;
    }

    public void Display() {
        RecursiveDisplay(root);
    }

    private void RecursiveDisplay(Node root) {
        if(root != null) {
            RecursiveDisplay(root.left);
            System.out.println(root.data);
            RecursiveDisplay(root.right);
            
        }
    }
}
