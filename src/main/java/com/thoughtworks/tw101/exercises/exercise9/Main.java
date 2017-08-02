package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

// Exercise #9: Create a class Node that implements a binary tree for Strings.
// It should have an add(String name) method that recursively finds the correct place to add a new node
// and a names() method that returns the names of all of the nodes in alphabetical order (this should also be implemented using recursion).

public class Main {
    public static void main(String[] args) {
        Node root = new Node("Cecil");

        root.add("Michelle");
        root.add("Bill");
        root.add("Jagruti");
        root.add("Tess");
        root.add("Sue-Ellen");
        root.add("Sara");
        root.add("Casey");

        List<String> names = root.names();

        for (String name : names) {
            System.out.println(name);
        }

    }
}
