package com.datastructures.BinaryTrees;

public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public void preOrder(Node root) {
        String traversal = "";

        traversal += String.valueOf(root.value) + "-";
    }


}
