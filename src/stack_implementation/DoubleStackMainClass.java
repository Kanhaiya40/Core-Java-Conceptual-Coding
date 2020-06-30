package stack_implementation;

public class DoubleStackMainClass {
    public static void main(String[] args) {
        Integer[] array = {23, 54, 67, 82, 47, 21};
        CustomStack<? extends Number> customStack = new CustomStack<>(array);
        customStack.pushToFirstStack();
        customStack.pushToFirstStack();
        customStack.addToSecondStack();
        customStack.addToSecondStack();
        customStack.addToSecondStack();
        customStack.addToSecondStack();
        customStack.printStack();

    }
}

