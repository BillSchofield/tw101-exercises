package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        printStream.println(String.format("Books containing '%s':", partialBookTitle));

        Pattern p = Pattern.compile(partialBookTitle);

        for (String book : this.books) {
            Matcher m = p.matcher(book);

            if (m.find()) {
                printStream.println("  * " + book);
            }
        }
    }
}
