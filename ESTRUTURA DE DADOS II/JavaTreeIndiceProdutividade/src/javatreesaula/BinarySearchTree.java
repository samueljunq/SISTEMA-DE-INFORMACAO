package javatreesaula;

import javax.swing.JTextArea;

public class BinarySearchTree<T extends Comparable<T>> {

    Node root = null;
    int count;

    public int add(T newData) {
        Node<T> newNode = new Node<T>(newData);
        count = 0;
        root = insert(root, newNode);
        return count;
    }

    private Node<T> insert(Node<T> root, Node<T> newNode) {
        count++;
        if (root == null) {
            return newNode;
        }

        if (newNode.data.compareTo(root.data) > 0) {
            root.right = insert(root.right, newNode);
        } else {
            root.left = insert(root.left, newNode);
        }

        return root; // Retorna a raiz atualizada.
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node<T> root) {
        if (root != null) {
            System.out.print(root.data + ", ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void preOrder(JTextArea listMostraDados) {
        preOrder(root, listMostraDados);
        listMostraDados.append("\n");
    }

    private void preOrder(Node<T> root, JTextArea listMostraDados) {
        if (root!= null) {
            listMostraDados.append(root.data.toString() + " |");
            preOrder(root.left, listMostraDados);
            preOrder(root.right, listMostraDados);
        }// fim 
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node<T> root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + ", ");
            inOrder(root.right);
        }
    }

    public String getDataPreOrder() {
        StringBuilder data = new StringBuilder();
        getDataPreOrder(root, data);
        return data.toString();
    }

    public void getDataPreOrder(Node<T> root, StringBuilder data) {
        if (root != null) {
            data.append(root.data.toString() + "\n");
            getDataPreOrder(root.left, data);
            getDataPreOrder(root.right, data);
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node<T> root) {
        if (root != null) {
            postOrder(root.right);
            postOrder(root.left);
            System.out.print(root.data + ", ");
        }
    }
}
//----------------------

