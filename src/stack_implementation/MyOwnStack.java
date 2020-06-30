package stack_implementation;

import java.util.Arrays;

public class MyOwnStack<E> {

    private final Object[] array;
    private int startingIndex;
    private int lastIndex;
    private int firstStackSize = 0;
    private int secondStackSize = 0;

    MyOwnStack(int size) {
        array = new Object[size];
        startingIndex = -1;
        lastIndex = array.length;
    }

    public void pushToStack1(E item) {
        if (startingIndex > lastIndex) {
            System.out.println("OverFlow Message No Element Can be inserted Now");
            System.exit(0);
        } else {
            firstStackSize++;
            array[++startingIndex] = item;
        }
    }

    public void pushToStack2(E item) {
        if (startingIndex > lastIndex) {
            System.out.println("OverFlow Message No Element Can be inserted Now");
            System.exit(0);
        } else {
            secondStackSize++;
            array[--lastIndex] = item;
        }
    }

    public void popFromStack1() {
        if (startingIndex == -1) {
            System.out.println("UnderFlow Stack is Empty");
        } else if (startingIndex == lastIndex) {
            array[--startingIndex] = null;

        }
    }

    public void popFromStack2() {
        if (startingIndex == -1) {
            System.out.println("UnderFlow Stack is Empty");
        } else if (startingIndex == lastIndex) {
            array[lastIndex] = null;
            lastIndex = lastIndex + 1;
        }
    }


    @SuppressWarnings("unchecked")
    public E peekOfStack1() {
        return (E) array[startingIndex];
    }

    @SuppressWarnings("unchecked")
    public E peekOfStack2() {
        return (E) array[lastIndex];
    }

    @Override
    public String toString() {
        return "" + Arrays.toString(array);
    }

    public int sizeOfStack1() {
        return firstStackSize;
    }

    public int sizeOfStack2() {
        return secondStackSize;
    }
}
