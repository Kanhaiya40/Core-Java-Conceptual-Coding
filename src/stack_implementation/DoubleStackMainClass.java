package stack_implementation;

public class DoubleStackMainClass {
    public static void main(String[] args) {
        MyOwnStack<Integer> combinedStack = new MyOwnStack<>(6);
        combinedStack.pushToStack1(23);
        combinedStack.pushToStack2(29);
        combinedStack.pushToStack1(20);
        combinedStack.pushToStack2(30);
        combinedStack.pushToStack1(33);
        combinedStack.pushToStack2(43);
        System.out.println(combinedStack);
        combinedStack.popFromStack2();
        combinedStack.pushToStack2(21);
        System.out.println(combinedStack);
        combinedStack.popFromStack1();
        System.out.println("Peek Of Stack-1:" + combinedStack.peekOfStack1());
        System.out.println("Peek Of Stack-2:" + combinedStack.peekOfStack2());
        System.out.println("Size Of Stack-1" + combinedStack.sizeOfStack1());
        System.out.println("Size Of Stack-2" + combinedStack.sizeOfStack2());
    }
}

