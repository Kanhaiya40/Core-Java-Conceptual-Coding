package oracledocumentation.chapter2;

import java.util.Date;

/**
 * Create a small program that defines some fields. Try creating some illegal field names and see
 * what kind of error the compiler produces. Use the naming rules and conventions as a guide.
 */
public class BookWithVaryingFields {
    private int id;
    private String bookName;
    private String bookAuthor;
    private Date publishedDate;
        /*Instead of  variable name if we are using keyword as variable name
          then we will get compile time error saying unspected tocken */
    //private int for;

}
