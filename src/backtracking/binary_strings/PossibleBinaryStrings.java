package backtracking.binary_strings;


class PossibleBinaryStrings {

    public static void main(String[] args) {
        int n =4;
        int[] someArray = new int[n];
        Generate generateBinaryStringCombination = new Generate();
        generateBinaryStringCombination.generateAllBinaryStrings(n, someArray, 0);
    }
}