package com.company;

import com.company.doublelinkedlist.DoubleLinkedList;
import com.company.linkedlist.LinkedList;
import com.company.sorteddll.SortedDoublyLinkedList;
import com.company.utis.Utils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SortedDoublyLinkedList sdll = new SortedDoublyLinkedList();
        sdll.addNewNode(5);
        sdll.addNewNode(15);
        sdll.addNewNode(25);
        sdll.addNewNode(35);
        sdll.addNewNode(37);
        sdll.addNewNode(45);

        SortedDoublyLinkedList sdll2 = new SortedDoublyLinkedList();
        sdll2.addNewNode(5);
        sdll2.addNewNode(66);
        sdll2.addNewNode(25);
        sdll2.addNewNode(21);
        sdll2.addNewNode(2);
        sdll2.addNewNode(45);

        SortedDoublyLinkedList sameValues = sdll.getSameValues(sdll2);

        System.out.println(sameValues.getListOfValues());
    }
}
