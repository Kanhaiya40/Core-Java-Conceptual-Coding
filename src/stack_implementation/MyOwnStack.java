package stack_implementation;

import java.util.Arrays;
import java.util.Iterator;

public class MyOwnStack<E> implements Iterable<E> {
    private int top;
    private final Object[] array;

    MyOwnStack(int size) {
        array = new Object[size];
        top = -1;
    }

    public void push(E item) {
        if (top == -1) {
            top++;
        }
        array[top++] = item;
    }
   /* public void pop() {
        array[top] = null;
        top = top - 1;
    }

    */

  /*  @SuppressWarnings("unchecked")
    public E peek() {
        return (E) array[top];
    }

   */

    @Override
    public String toString() {
        return "" + Arrays.toString(array);
    }

    @Override
    public Iterator<E> iterator() {
        top=0;
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return array[top]!=null;
            }
            @SuppressWarnings("unchecked")
            @Override
            public E next() {
                if (hasNext())
                    return (E) array[top++];
                return null;
            }
        };
    }
}
