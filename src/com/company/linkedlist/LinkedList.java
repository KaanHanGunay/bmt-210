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
            this.tail.next = new Node(value);
            this.tail = this.tail.next;
        }
        System.out.println("Toplam => " + this.sumAllNodes());
        System.out.println("Eleman Listesi => " + this.getListOfValues());
    }

    public void removeTail() {
        Node temp = this.head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        this.tail = temp;
        this.tail.next = null;
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
            sum += temp.data;
            temp = temp.next;
        }

        return sum;
    }

    private String getListOfValues() {
        StringBuilder listOfElements = new StringBuilder();

        Node temp = this.head;
        while (temp != null) {
            listOfElements.append(temp.data).append(",");
            temp = temp.next;
        }

        return listOfElements.substring(0, listOfElements.length() - 1);
    }

    public LinkedList copy() {
        LinkedList linkedList = new LinkedList();

        Node temp = this.head;
        while (temp != null) {
            linkedList.addNewNode(temp.data);
            temp = temp.next;
        }

        System.out.println("Yeni listenin elemanları => " + linkedList.getListOfValues());
        return linkedList;
    }
}
