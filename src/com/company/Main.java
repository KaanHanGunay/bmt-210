package com.company;

import com.company.doublelinkedlist.DoubleLinkedList;
import com.company.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addNewNode(3);
        ll.addNewNode(5);
        ll.addNewNode(7);
        ll.addNewNode(9);
        ll.addNewNode(11);
        ll.printReverse();
    }
}
