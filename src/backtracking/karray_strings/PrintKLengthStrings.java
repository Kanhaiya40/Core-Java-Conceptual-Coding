package backtracking.karray_strings;

public class PrintKLengthStrings {

    void printRecord(char[] set, String prefix, int n, int k) {
        if (k == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < n; ++i) {
            String newPrefix = prefix + set[i];
            printRecord(set, newPrefix,
                    n, k - 1);
        }
    }
}
