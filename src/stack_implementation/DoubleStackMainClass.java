package stack_implementation;

public class DoubleStackMainClass {
    public static void main(String[] args) {
        Integer[] array = {23, 54, 67, 82, 47, 21};
        CustomStack<? extends Number> customStack = new CustomStack<>(array);
        customStack.pushToFirstStack();
        customStack.pushToFirstStack();
        customStack.pushToSecondStack();
        customStack.pushToSecondStack();
        customStack.pushToSecondStack();
        customStack.pushToSecondStack();
        customStack.printStack();
        System.out.println();
        System.out.println("Size Of First Stack:" + customStack.firstStackSize());
        System.out.println("Size Of Second Stack:" + customStack.secondStackSize());
        customStack.popFromFirstStack();
        customStack.popFromSecondStack();
        customStack.popFromFirstStack();
        customStack.popFromSecondStack();
        System.out.println("Peek Of First Stack:" + customStack.peekOfFirstStack());
        System.out.println("Peek Of Second Stack:" + customStack.peekOfSecondStack());
        customStack.printStack();
        System.out.println();
        System.out.println("Size Of First Stack:" + customStack.firstStackSize());
        System.out.println("Size Of Second Stack:" + customStack.secondStackSize());
    }
}

