package backtracking.karray_strings;

class KArrayStrings {

    public static void main(String[] args) {
        System.out.println("First Test");
        char[] set1 = {'a', 'b'};
        int k = 3;
        Generate generateAllPossibleKLengthStrings = new Generate();
        generateAllPossibleKLengthStrings.printAllKLength(set1, k);

        System.out.println("\nSecond Test");
        char[] set2 = {'a', 'b', 'c', 'd'};
        k = 1;
        generateAllPossibleKLengthStrings.printAllKLength(set2, k);
    }
}
