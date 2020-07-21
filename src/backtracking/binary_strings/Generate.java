package backtracking.binary_strings;

public class Generate {

    Print printEachCombination;

    Generate() {
        printEachCombination = new Print();
    }

    void generateAllBinaryStrings(int lastIndex, int[] customArray, int currentIndex) {
        if (currentIndex == lastIndex) {
            printEachCombination.printTheArray(customArray, lastIndex);
            return;
        }
        customArray[currentIndex] = 0;
        generateAllBinaryStrings(lastIndex, customArray, currentIndex + 1);
        customArray[currentIndex] = 1;
        generateAllBinaryStrings(lastIndex, customArray, currentIndex + 1);
    }
}
