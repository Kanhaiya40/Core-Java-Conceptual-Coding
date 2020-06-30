package stack_implementation;


import java.util.Iterator;

public class CustomStack<E> {
    private final Object[] customArray;
    private final MyOwnStack<E> stack1;
    private final MyOwnStack<E> stack2;
    private int front;
    private int rear;
    private int firstStackSize;
    private int secondStackSize;

    CustomStack(Object[] customArray) {
        this.customArray = customArray;
        this.stack1 = new MyOwnStack<>(customArray.length);
        this.stack2 = new MyOwnStack<>(customArray.length);
        front = 0;
        rear = customArray.length - 1;
    }

    @SuppressWarnings("unchecked")
    public void pushToFirstStack() {
        if (front > rear) {
            System.out.println("OverFlow No Element Can Be Inserted Now");
            System.exit(0);
        } else
            stack1.push((E) customArray[front++]);
    }

    @SuppressWarnings("unchecked")
    public void pushToSecondStack() {
        if (front > rear) {
            System.out.println("OverFlow No Element Can Be Inserted Now");
            System.exit(0);
        } else
            stack2.push((E) customArray[rear--]);
    }

    public void popFromFirstStack() {
        stack1.pop();
    }

    public void popFromSecondStack() {
        stack2.pop();
    }

    public void printStack() {
        System.out.print("Stack-1 Elements:");
        Iterator<E> iterator1 = stack1.iterator();
        if (iterator1.hasNext()) {
            firstStackSize = 0;
            do {
                System.out.print(iterator1.next() + " ");
                firstStackSize++;
            } while (iterator1.hasNext());
        }
        System.out.println();
        System.out.print("Stack-2 Element:");
        Iterator<E> iterator2 = stack2.iterator();
        if (iterator2.hasNext()) {
            secondStackSize = 0;
            do {
                System.out.print(iterator2.next() + " ");
                secondStackSize++;
            } while (iterator2.hasNext());
        }
    }

    public int firstStackSize() {
        return firstStackSize;
    }

    public int secondStackSize() {
        return secondStackSize;
    }

    public E peekOfFirstStack() {
        return stack1.peek();
    }

    public E peekOfSecondStack() {
        return stack2.peek();
    }
}
