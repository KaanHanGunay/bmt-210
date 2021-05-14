package com.company.binaryTree;

public class BinaryTree<T extends Comparable<T>> {

    Node<T> root;

    public void add(T value) {
        root = addRecursive(root, value);
    }

    private Node<T> addRecursive(Node<T> current, T value) {

        if (current == null) {
            return new Node<>(value);
        }

        if (value.compareTo(current.getValue()) < 0) {
            current.left = addRecursive(current.left, value);
        } else if (value.compareTo(current.getValue()) > 0) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int maxDepth(Node<T> node) {
        if (node == null)
            return 0;
        else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    public int maxDepth() {
        return maxDepth(root);
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
}
