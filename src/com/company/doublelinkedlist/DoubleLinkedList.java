package com.company.doublelinkedlist;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        this.head = new Node();
        this.tail = this.head;
    }

    public DoubleLinkedList(Integer value) {
        this.head = new Node();
        this.tail = this.head;
        this.head.setData(value);
    }

    public void addNewNode(Integer value) {
        if (this.head.data == null) {
            this.head.setData(value);
            this.tail = head;
        } else {
            Node node = new Node();
            node.setData(value);
            this.tail.next = node;
            node.setPrev(this.tail);
            this.tail = node;
        }
    }

    public void remove() {
        if (this.tail.prev == null) {
            this.head.setData(null);
        }

        Node temp = this.tail.getPrev();
        temp.setNext(null);
        this.tail = temp;
    }

    private String getListOfValues() {
        StringBuilder listOfElements = new StringBuilder();

        Node temp = this.head;
        while (temp != null) {
            listOfElements.append(temp.getData()).append(",");
            temp = temp.getNext();
        }

        return listOfElements.substring(0, listOfElements.length() - 1);
    }

    public void swapNodes(int index1, int index2) {
        Node temp = this.head;
        Node swap1 = null;
        Node swap2 = null;
        int index = 0;

        while (temp != null) {
            if (index1 == index) {
                swap1 = temp;
            }
            if (index2 == index) {
                swap2 = temp;
            }

            index++;
            temp = temp.getNext();
        }

        if (swap1 == null || swap2 == null) {
            return;
        }

        if (swap1.getPrev() != null) {
            swap1.getPrev().setNext(swap2);
        }
        if (swap2.getPrev() != null) {
            swap2.getPrev().setNext(swap1);
        }

        Node temp2 = swap1.getPrev();
        swap1.setPrev(swap2.getPrev());
        swap2.setPrev(temp2);

        Node temp3 = swap1.getNext();
        swap1.setNext(swap2.getNext());
        swap2.setNext(temp3);

        if (index1 == 0) {
            this.head = swap2;
        }
        if (index2 == 0) {
            this.head = swap1;
        }
        if (index1 == (index - 1)) {
            this.tail = swap2;
        }
        if (index2 == (index - 1)) {
            this.tail = swap1;
        }

        System.out.println(this.getListOfValues());
    }

    public void addNewNode(int index, int data) {
        Node temp = this.head;
        int location = 0;
        Node newNode = new Node();
        newNode.setData(data);

        if (index == 0) {
            newNode.setNext(temp);
            temp.setPrev(newNode);
            this.head = newNode;
        } else {
            while (temp != null) {
                if (index == location) {
                    break;
                }

                location++;
                temp = temp.getNext();
            }

            if (temp != null) {
                temp = temp.getPrev();
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
                newNode.setPrev(temp);
            } else {
                if (index == location) {
                    this.tail.setNext(newNode);
                    newNode.setPrev(this.tail);
                    this.tail = newNode;
                } else {
                    throw new RuntimeException("Geçerli bir index belirtin");
                }
            }
        }

        System.out.println(this.getListOfValues());
    }

    public void removeAt(int index) {
        Node temp = this.head;
        int location = 0;

        if (index == 0) {
            temp = temp.getNext();
            temp.setPrev(null);
            this.head = temp;
        } else {
            while (temp != null) {
                if (location == index) {
                    break;
                }

                location++;
                temp = temp.getNext();
            }

            if (temp != null) {
                if (temp.getNext() != null) {
                    temp.getPrev().setNext(temp.getNext());
                    temp.getNext().setPrev(temp.getPrev());
                } else {
                    this.tail = this.tail.getPrev();
                    this.tail.next = null;
                }
            } else {
                System.out.println(this.getListOfValues());
                return;
            }
        }

        System.out.println(this.getListOfValues());
    }
}
