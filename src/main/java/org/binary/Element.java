package org.binary;

public class Element<TYPE> {

    private TYPE value;
    private Element<TYPE> left;
    private Element<TYPE> right;

    public Element(TYPE value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Element<TYPE> getLeft() {
        return left;
    }

    public void setLeft(Element<TYPE> left) {
        this.left = left;
    }

    public Element<TYPE> getRight() {
        return right;
    }

    public void setRight(Element<TYPE> right) {
        this.right = right;
    }

    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }
}
