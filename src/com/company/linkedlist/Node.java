package com.company.linkedlist;

public class Node {
    private Integer data;
    private Node next;

    public Node() {
        next = null;
    }

    public Node(int d) {
        data = d;
        next = null;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
