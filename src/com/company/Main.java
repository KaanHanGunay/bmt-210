package com.company;

import com.company.binaryTree.BinaryTree;
import com.company.binaryTree.BinaryTreePrinter;
import com.company.binaryTree.Node;

public class Main {

    public static void main(String[] args) {
        BinaryTree<Double> bt = new BinaryTree<>();

        bt.add(4.0);
        bt.add(7.7);
        bt.add(2.7);
        bt.add(8.7);
        bt.add(6.7);
        bt.add(1.7);
        bt.add(10.);

        Node<Double> node = bt.getRoot().getLeft();

        BinaryTreePrinter btp = new BinaryTreePrinter(node);
        System.out.println(btp.print());
        System.out.println("Derinlik => " + bt.maxDepth(node));
    }
}
