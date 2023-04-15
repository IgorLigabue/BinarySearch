package org.binary;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

    Tree<Integer> tree = new Tree<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            tree.add(random.nextInt(10));
        }

        System.out.println("\nIn order:");
        tree.printInOrder(tree.getRoot());

        System.out.println("\nPre order:");
        tree.printPreOrder(tree.getRoot());

        System.out.println("\nPost order:");
        tree.printPostOrder(tree.getRoot());
    }
}