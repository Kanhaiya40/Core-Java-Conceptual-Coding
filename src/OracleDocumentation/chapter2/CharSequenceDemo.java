package OracleDocumentation.chapter2;

        // CharSequenceDemo presents a String value -- backwards.
        public class CharSequenceDemo implements CharSequence {
                private String sentence;

                CharSequenceDemo(String sentence) {
                        this.sentence=sentence;
                }
                /*
                * It returns Character from end
                 */
                public char fromEnd(int i) {
                        return sentence.charAt(sentence.length()-1-i);
                }

                /*
                * It return character from start index
                 */
                public char fromStart(int i) {
                        return sentence.charAt(sentence.charAt(i));
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
                        StringBuffer stringBuffer=new StringBuffer(this.sentence);
                        return stringBuffer.subSequence(i,i1);
                }

                public StringBuffer reverse()
                {
                        StringBuffer sentence=new StringBuffer(this.sentence);
                        return sentence.reverse();
                }

                public static void main(String[] args) {
                        CharSequenceDemo charSequenceDemo=new CharSequenceDemo("I am Kanhaiya");
                        System.out.println(charSequenceDemo.length());
                        System.out.println(charSequenceDemo.reverse());

                        for (int i = 0; i < charSequenceDemo.reverse().length() ; i++) {
                                System.out.print(charSequenceDemo.fromEnd(i));
                        }

                }
        }

