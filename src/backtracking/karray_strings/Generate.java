package backtracking.karray_strings;

public class Generate {

    PrintKLengthStrings printEachCombination;

    Generate() {
        printEachCombination = new PrintKLengthStrings();
    }

    void printAllKLength(char[] set, int sizeOfArray) {
        int lengthOfSet = set.length;
        printEachCombination.printRecord(set, "", lengthOfSet, sizeOfArray);
    }
}
