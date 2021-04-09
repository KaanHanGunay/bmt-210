package com.company.linkedlist;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
    }

    public LinkedList(int value) {
        this.head = new Node(value);
        this.tail = this.head;
        System.out.println(value);
    }

    public void addNewNode(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            this.tail = this.head;
        } else {
            this.tail.setNext(new Node(value));
            this.tail = this.tail.getNext();
        }
        System.out.println("Toplam => " + this.sumAllNodes());
        System.out.println("Eleman Listesi => " + this.getListOfValues());
    }

    public void removeTail() {
        Node temp = this.head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }

        this.tail = temp;
        this.tail.setNext(null);
        System.out.println("Toplam => " + this.sumAllNodes());
        System.out.println("Eleman Listesi => " + this.getListOfValues());
    }

    private Integer sumAllNodes() {
        Integer sum = 0;

        if (this.head == null) {
            return sum;
        }

        Node temp = this.head;
        while (temp != null) {
            sum += temp.getData();
            temp = temp.getNext();
        }

        return sum;
    }

    public String getListOfValues() {
        StringBuilder listOfElements = new StringBuilder();

        Node temp = this.head;
        while (temp != null) {
            listOfElements.append(temp.getData()).append(",");
            temp = temp.getNext();
        }

        return listOfElements.substring(0, listOfElements.length() - 1);
    }

    public LinkedList copy() {
        LinkedList linkedList = new LinkedList();

        Node temp = this.head;
        while (temp != null) {
            linkedList.addNewNode(temp.getData());
            temp = temp.getNext();
        }

        System.out.println("Yeni listenin elemanları => " + linkedList.getListOfValues());
        return linkedList;
    }

    public LinkedList subList(int start, int end) {

        if ((start > end) && (start >= 0)) {
            throw new RuntimeException("Lütfen geçerli bir aralık belirtiniz");
        }

        LinkedList linkedList = new LinkedList();

        int index = 0;
        Node temp = this.head;

        while (temp != null) {

            if (index >= start && index < end) {
                linkedList.addNewNode(temp.getData());
            }

            temp = temp.getNext();
            index++;
        }

        System.out.println(linkedList.getListOfValues());
        return linkedList;
    }

    public void concatLists(LinkedList otherLinkedList) {
        this.tail.setNext(otherLinkedList.head);
        this.sort();
        System.out.println(this.getListOfValues());
    }

    public void sort() {
        Node current = this.head;
        Node index = null;
        int temp;

        if (this.head == null || this.head.getData() == null) {
            return;
        } else {
            while (current != null) {
                index = current.getNext();

                while (index != null) {
                    if (current.getData() > index.getData()) {
                        temp = current.getData();
                        current.setData(index.getData());
                        index.setData(temp);
                    }

                    index = index.getNext();
                }

                current = current.getNext();
            }
        }
    }

    public void printReverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }

        this.head = prev;
        System.out.println(this.getListOfValues());
    }
}
/**
 * Node reverse(Node node)
 *     {
 *         Node prev = null;
 *         Node current = node;
 *         Node next = null;
 *         while (current != null) {
 *             next = current.next;
 *             current.next = prev;
 *             prev = current;
 *             current = next;
 *         }
 *         node = prev;
 *         return node;
 *     }
 *
 +*/