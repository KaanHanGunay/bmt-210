package com.company.doublelinkedlist;

public class Node {
    Integer data;
    Node next;
    Node prev;

    public Node() {
        this.next = null;
        this.prev = null;
    }

    public Node(Node prev, Integer data) {
        prev.setNext(this);
        this.setPrev(prev);
        this.setNext(null);
        this.data = data;
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

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
