package stack_implementation;

import java.util.Arrays;

public class Stacks<E> {

    private final Object[] array;
    private int startingIndex;
    private int lastIndex;

    Stacks(int size) {
        array = new Object[size];
        startingIndex = -1;
        lastIndex = array.length-1;
    }

    public void pushToStack1(E item) {
        if (startingIndex >= lastIndex) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            array[++startingIndex] = item;
        }
    }

    public void pushToStack2(E item) {
        if ( lastIndex <= startingIndex) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            array[lastIndex--] = item;
        }
    }

    public void popFromStack1() {
        if (startingIndex == -1) {
            System.out.println("UnderFlow Stack is Empty");
        }
        array[startingIndex--] = null;
    }

    public void popFromStack2() {
        if (startingIndex == -1) {
            System.out.println("UnderFlow Stack is Empty");
        }
        array[lastIndex++] = null;
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
        return startingIndex + 1;
    }

    public int sizeOfStack2() {
        return array.length - lastIndex;
    }
}
