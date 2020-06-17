package oracledocumentation.chapter1;

public class MultiLevelBreaks {
    public static void main(String[] args) {
        String forTest = "Java Tutorial";
        int max2 = forTest.length();
        test:for (int i = 0; i <= max2; i++) {
            if (forTest.charAt(i) == 'J') {
                for (int k = 1; k < max2; k++) {
                    if (forTest.charAt(i + k) != forTest.charAt(k)) {
                        continue test;
                    }
                }     /*  end of inner for loop  */
            }
        }             /*  end of outer for loop  */
    }
}
