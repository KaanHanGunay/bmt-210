package com.company;

import com.company.doublelinkedlist.DoublyLinkedList;
import com.company.linkedlist.LinkedList;
import com.company.sorteddll.SortedDoublyLinkedList;
import com.company.utis.Utils;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        SortedDoublyLinkedList sdll = new SortedDoublyLinkedList();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            sdll.addNewNode(random.nextInt(20));
        }
        System.out.println(sdll.getListOfValues());

        sdll.remove();
        System.out.println(sdll.getListOfValues());

        sdll.remove(5);
        System.out.println(sdll.getListOfValues());

        sdll.removeValue(5);
        System.out.println(sdll.getListOfValues());

        SortedDoublyLinkedList sdll2 = new SortedDoublyLinkedList();
        for (int i = 0; i < 10; i++) {
            sdll2.addNewNode(random.nextInt(20));
        }
        System.out.println(sdll2.getListOfValues());

        SortedDoublyLinkedList sdll3 = sdll.getSameValues(sdll2);
        System.out.println(sdll3.getListOfValues());
    }
}
