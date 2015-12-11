package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {

        for(String book : books){
            if(phraseMatch(book, partialBookTitle)){
                printStream.println(book);
            }
        }
    }

    private boolean phraseMatch(String phrase, String partial){
        return phrase.contains(partial);
    }
}
