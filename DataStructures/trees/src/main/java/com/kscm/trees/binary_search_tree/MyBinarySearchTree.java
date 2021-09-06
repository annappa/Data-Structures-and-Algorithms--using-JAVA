package com.kscm.trees.binary_search_tree;

import com.sun.deploy.util.StringUtils;

public class MyBinarySearchTree {
    private MyBinaryNode root;

    public MyBinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        if(root == null) {
            root = new MyBinaryNode(value);
            return;
        }
        MyBinaryNode currentNode = root;
        while (true) {
            if (currentNode.getValue() > value) {
                if(currentNode.getLeft() == null) {
                    currentNode.setLeft(new MyBinaryNode(value));
                    return;
                }
                currentNode = currentNode.getLeft();
            } else {
                if(currentNode.getRight() == null) {
                    currentNode.setRight(new MyBinaryNode(value));
                    return;
                }
                currentNode = currentNode.getRight();
            }
        }
    }

    public MyBinaryNode lookup(int value) {
        if(root == null) {
            return null;
        }
        MyBinaryNode currentNode = root;
        while (currentNode != null) {
            if(value < currentNode.getValue()) {
                currentNode = currentNode.getLeft();
            } else if(value > currentNode.getValue()) {
                currentNode = currentNode.getRight();
            } else {
                return currentNode;
            }
        }
        return null;
    }

    int count = 0;
    public void printTree() {
        count = 0;
        printTree(root);
    }


    private void printTree(MyBinaryNode node) {
        System.out.print(node.getValue());
        System.out.println();
        count++;
        if(node.getLeft() != null) {
            //System.out.print("\t".repeat(Math.max(0, count)) + "Left: ");
            //repeated = new String(new char[n]).replace("\0", s);
            System.out.print(new String(new char[Math.max(0, count)]).replace("\0", "\t") + "Left: ");
            System.out.print("\t");
            printTree(node.getLeft());
        }
        if(node.getRight() != null) {
            //System.out.print("\t".repeat(Math.max(0, count)) +"Right: ");
            System.out.print(new String(new char[Math.max(0, count)]).replace("\0", "\t") +"Right: ");
           // System.out.print("\t" +"Right: ");
            printTree(node.getRight());
        }
        count--;
    }

    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(20);
        tree.insert(1);
        tree.insert(6);
        tree.insert(15);
        tree.insert(170);
        tree.printTree();
        /*//tree.remove(20);
        //tree.remove(4);
        tree.printTree();
        tree.insert(20);
        tree.insert(18);
        tree.insert(10);
        tree.printTree();
        tree.remove(170);
        tree.printTree();
        System.out.println("Breath first search " + tree.breathFirstSearchIteratively());
        System.out.println("Depth first search - in order " + tree.depthFirstSearchInOder(SearchType.IN_ORDER));
        System.out.println("Depth first search - pre order " + tree.depthFirstSearchInOder(SearchType.PRE_ORDER));
        System.out.println("Depth first search - post order " + tree.depthFirstSearchInOder(SearchType.POST_ORDER));*/
    }
}
