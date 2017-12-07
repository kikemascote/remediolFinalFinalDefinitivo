package mx.maxa.node;

public class node<T> implements Comparable<T> {
    private T value;
    private node<T> Left = null;
    private node<T> Right = null;
    private long index = 0;

    public node() {
        this.value = null;

    }

    public node(T value) {
        this.value = value;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    @Override
    public String toString() {

        return super.toString();
    }

    @Override
    public int compareTo(T o) {

        return 0;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public node<T> getLeft() {
        return Left;
    }

    public void setLeft(node<T> left) {
        Left = left;
    }

    public node<T> getRight() {
        return Right;
    }

    public void setRight(node<T> right) {
        Right = right;
    }


}
