package org.binary;

public class Tree<TYPE extends Comparable> {

    private Element<TYPE> root;

    public Tree() {
        this.root = null;
    }

    public void add(TYPE value) {
        Element<TYPE> element = new Element<>(value);
        if (root == null) {
            this.root = new Element<>(value);
        } else {
            Element<TYPE> current = this.root;
            while (true) {
                if (element.getValue().compareTo(current.getValue()) < 0) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(element);
                        break;
                    }
                } else {
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(element);
                        break;
                    }
                }
            }
        }
    }

    public Element<TYPE> getRoot() {
        return root;
    }

    public void printInOrder(Element<TYPE> current) {
        if (current != null) {
            printInOrder(current.getLeft());
            System.out.println(current.getValue());
            printInOrder(current.getRight());
        }
    }

    public void printPreOrder(Element<TYPE> current) {
        if (current != null) {
            System.out.println(current.getValue());
            printPreOrder(current.getLeft());
            printPreOrder(current.getRight());
        }
    }
    public void printPostOrder(Element<TYPE> current) {
        if (current != null) {
            printPostOrder(current.getLeft());
            printPostOrder(current.getRight());
            System.out.println(current.getValue());
        }
    }

}
