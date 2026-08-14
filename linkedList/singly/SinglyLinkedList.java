package com.datastructures.linkedlist.singly;


public class SinglyLinkedList<T> {
    private Node<T> head;


    public SinglyLinkedList(Node<T> head) {
        this.head = head;
    }

    public int size() {
        int counter = 1;
        Node<T> current = this.head;

        while (current.next != null) {
            counter += 1;
            current = current.next;
        }
        return counter;
    }

    private boolean isSizeZero() {
        if (this.size() == 0) {
            return true;
        }
        return false;
    }

    public void formattedPrint() {
        String linkedListFormatted = "";
        Node<T> current = this.head;

        while (current.next != null) {
            linkedListFormatted = linkedListFormatted + " " + current.data + " ---> ";
            current = current.next;
        }
        linkedListFormatted = linkedListFormatted + " " + current.data + " ---> null";
        System.out.println(linkedListFormatted);

    }


    public void append(T dataForNode) {
        if (this.size() == 0) {
            return;
        }
        Node<T> nodeToAppend = new Node<>(dataForNode, null);
        Node<T> current = this.head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = nodeToAppend;
    }

    public void prepend(T dataForNode) {
        if (this.isSizeZero()) {
            return;
        }
        Node<T> nodeToPrepend = new Node<>(dataForNode, this.head);
        nodeToPrepend.next = this.head;
        this.head = nodeToPrepend;
    }  
    
    public Node<T> get(int index) {
        Node<T> current = this.head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
        
    }

    public void insertAfter(T nodeData, Node<T> insertAfter) {
        Node<T> newNode = new Node<>(nodeData, insertAfter.next);
        insertAfter.next = newNode;
    }
}
