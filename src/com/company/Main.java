package com.company;

import com.company.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(87);
        linkedList.addNewNode(4);
        linkedList.addNewNode(6);
        linkedList.removeTail();

        LinkedList linkedList1 = linkedList.copy();
        linkedList1.addNewNode(2);
        linkedList.addNewNode(43);
    }
}
