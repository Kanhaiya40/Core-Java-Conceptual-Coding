package stack_implementation;


public class CustomStack<E> {
    private final Object[] customArray;
    private final MyOwnStack<E> stack1;
    private final MyOwnStack<E> stack2;
    private int front;
    private int rear;

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
    public void addToSecondStack() {
        if (front > rear) {
            System.out.println("OverFlow No Element Can Be Inserted Now");
            System.exit(0);
        } else
            stack2.push((E) customArray[rear--]);
    }

    public void printStack() {
        System.out.print("Stack-1 Elements:");
        for (E valueOfStack1 : stack1) {
            System.out.print(valueOfStack1 + " ");
        }
        System.out.println();
        System.out.print("Stack-2 Element:");
        for (E ValueOfStack2 : stack2) {
            System.out.print(ValueOfStack2 + " ");
        }
    }

}
