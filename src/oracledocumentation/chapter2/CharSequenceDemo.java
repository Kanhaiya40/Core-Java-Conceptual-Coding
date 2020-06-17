package oracledocumentation.chapter2;

// CharSequenceDemo presents a String value -- backwards.
public class CharSequenceDemo implements CharSequence {
    private static String sentence;

    CharSequenceDemo(String sentence) {
        CharSequenceDemo.sentence = sentence;
    }

    /*
     * It returns Character from end
     */
    public static char fromEnd(int i) {
        return sentence.charAt(sentence.length() - 1 - i);
    }

    /*
     * It return character from start index
     */
    public static char fromStart(int i) {
        return reverse().charAt(i);
    }

    public static StringBuffer reverse() {
        StringBuffer sentence = new StringBuffer(CharSequenceDemo.sentence);
        return sentence.reverse();
    }

    public static void main(String[] args) {
        CharSequenceDemo charSequenceDemo = new CharSequenceDemo("I am Kanhaiya");
        System.out.println(charSequenceDemo.length());
        System.out.println(reverse());
        for (int i = 0; i < reverse().length(); i++) {
            System.out.print(fromStart(i));
        }
        System.out.println();
        for (int i = 0; i < reverse().length(); i++) {
            System.out.print(fromEnd(i));
        }
    }

    @Override
    public int length() {
        return sentence.length();
    }

    @Override
    public char charAt(int i) {
        return sentence.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        StringBuilder stringBuffer = new StringBuilder(sentence);
        return stringBuffer.subSequence(i, i1);
    }
}

