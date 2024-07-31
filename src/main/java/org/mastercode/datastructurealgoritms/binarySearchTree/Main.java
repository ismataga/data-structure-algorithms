package org.mastercode.datastructurealgoritms.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(7);
        tree.insert(3);
        tree.insert(8);
        tree.insert(9);
        tree.insert(2);
        tree.insert(10);

        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.insert(5);
        tree2.insert(7);
        tree2.insert(3);
        tree2.insert(8);
        tree2.insert(9);
        tree2.insert(2);
        tree2.insert(1);

        System.out.println("-----------"+ tree.equals(tree2));
    }
}
