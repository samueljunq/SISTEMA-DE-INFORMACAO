/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatreesaula;

/**
 *
 * @author 15449418620
 */
public class Tree {
    private Node root;
    private int count;

    public Tree() {
        this.root = null;
        this.count = 0;
    }

    public int add(Produtividade produtividade) {
        Node newNode = new Node(produtividade);
        count = 0;
        root = insert(root, newNode);
        return count;
    }

    private Node insert(Node root, Node newNode) {
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
}
