package com.thoughtworks.tw101.exercises.exercise4;

//Exercise #4: Create a class Library with a method PrintBooksContaining(String partialBookName) that prints out all of
// the books in the Library whose title contains the string passed in. You should pass an array of book titles into the
// Library constructor.

public class Main {
    public static void main(String[] args) {
        String[] books = {
                "Harry Potter and the Sorcerer's Stone",
                "An Introduction to Pottery",
                "Sorcerer Intro",
                "To the Stone-Cutters"
        };

        Library library = new Library(books, System.out);

        System.out.println("Match word: Potter");
        library.printBooksContaining("Potter");
        System.out.println("-----------------\n");

        System.out.println("Match word: Sorcerer");
        library.printBooksContaining("Sorcerer");
        System.out.println("-----------------\n");

        System.out.println("Match word: Intro");
        library.printBooksContaining("Intro");
        System.out.println("-----------------\n");

        System.out.println("Match word: Stone");
        library.printBooksContaining("Stone");
        System.out.println("-----------------\n");
    }
}
