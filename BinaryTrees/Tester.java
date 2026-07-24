package com.datastructures.BinaryTrees;

public class Tester {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);
        root.left = n1;
        n1.left = n2;
        n1.right = n3;
        root.right = n4;
        n4.right = n5;
        n5.left = n6;
        BinaryTree tree = new BinaryTree(root);

        String traversal = "";

        tree.preOrder(root, traversal);

        System.out.println(traversal);
    }
    
    
}
