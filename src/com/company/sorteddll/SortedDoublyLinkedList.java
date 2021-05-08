package com.company.sorteddll;

public class SortedDoublyLinkedList {
    Node head;
    Node tail;

    public SortedDoublyLinkedList() {
        this.head = new Node();
        this.tail = this.head;
    }

    public SortedDoublyLinkedList(int value) {
        this.head = new Node();
        this.tail = this.head;
        this.head.setData(value);
    }

    public void addNewNode(int value) {
        if (this.head.getData() == null) {
            this.head.setData(value);
        } else {
            Node temp = this.head;
            Node newNode = new Node();
            newNode.setData(value);

            if (temp.getData() > value) {
                newNode.setNext(this.head);
                this.head.setPrev(newNode);
                this.head = newNode;
            } else {
                while (temp != null) {
                    if (temp.getData() > value) {
                        break;
                    }
                    temp = temp.getNext();
                }

                if (temp != null) {
                    temp.getPrev().setNext(newNode);
                    newNode.setPrev(temp.getPrev());
                    newNode.setNext(temp);
                    temp.setPrev(newNode);
                } else {
                    this.tail.setNext(newNode);
                    newNode.setPrev(this.tail);
                    this.tail = newNode;
                }
            }
        }
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

    public void remove() {

        if (this.head.getData() == null) {
            return;
        }

        if (this.head.getNext() != null) {
            this.tail = tail.getPrev();
            this.tail.setNext(null);
        } else {
            this.head.data = null;
        }
    }

    public void remove(int index) {

        if (this.head.getData() == null) {
            return;
        }

        Node temp = this.head;
        int i = 0;

        while (temp != null) {

            if (i == index) {
                break;
            }

            i++;
            temp = temp.getNext();
        }

        if (temp != null) {
            if (temp.getPrev() != null) {
                temp.getPrev().setNext(temp.getNext());
            } else {
                this.head = this.head.getNext();
                this.head.setPrev(null);
            }

            if (temp.getNext() != null) {
                temp.getNext().setPrev(temp.getPrev());
            } else {
                this.tail = this.tail.getPrev();
                this.tail.setNext(null);
            }
        }
    }

    public void removeValue(int value) {
        if (this.head.getData() == null) {
            return;
        }

        Node temp = this.head;

        while (temp != null) {
            if (temp.getData() == value) {
                break;
            }

            temp = temp.getNext();
        }

        if (temp != null) {
            if (temp.getPrev() != null) {
                temp.getPrev().setNext(temp.getNext());
            } else {
                if (temp.getNext() != null) {
                    this.head = this.head.getNext();
                } else {
                    this.head.setData(null);
                }

                this.head.setPrev(null);
            }

            if (temp.getNext() != null) {
                temp.getNext().setPrev(temp.getPrev());
            } else {
                if (temp.getPrev() != null) {
                    this.tail = this.tail.getPrev();
                }

                this.tail.setNext(null);
            }
        }
    }

    public SortedDoublyLinkedList getSameValues(SortedDoublyLinkedList sdll) {

        if (this.head.getData() == null || sdll.head.getData() == null) {
            return null;
        }

        SortedDoublyLinkedList sameValues = new SortedDoublyLinkedList();
        Node temp = this.head;

        while (temp != null) {
            Node temp2 = sdll.head;
            while (temp2 != null) {
                if (temp.getData().equals(temp2.getData())) {
                    sameValues.addNewNode(temp.data);
                }
                temp2 = temp2.getNext();
            }
            temp = temp.getNext();
        }

        return sameValues;
    }
}
