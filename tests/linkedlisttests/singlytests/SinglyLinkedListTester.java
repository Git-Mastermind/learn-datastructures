package com.datastructures.tests.linkedlisttests.singlytests;
import com.datastructures.linkedlist.singly.SinglyLinkedList;
import com.datastructures.linkedlist.singly.Node;

public class SinglyLinkedListTester {
    public static void main(String[] args) {
        Node<String> head = new Node<>("A", null);
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>(head);
        linkedList.append("B");
        linkedList.prepend("C");
        Node<String> insertAfter = linkedList.get(1);
        linkedList.insertAfter("D", insertAfter);
        linkedList.formattedPrint();


    }
}
