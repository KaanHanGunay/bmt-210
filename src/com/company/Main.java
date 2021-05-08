package com.company;

import com.company.binaryTree.BinaryTree;
import com.company.binaryTree.BinaryTreePrinter;
import com.company.binaryTree.Node;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(4);
        bt.add(7);
        bt.add(2);
        bt.add(8);
        bt.add(6);
        bt.add(1);
        bt.add(10);

        Node node = bt.getRoot().getLeft();

        BinaryTreePrinter btp = new BinaryTreePrinter(node);
        System.out.println(btp.print());
        System.out.println("Derinlik => " + bt.maxDepth(node));
    }
}
