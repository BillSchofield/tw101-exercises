package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(name) < 0) {
            if (leftNodeExists()) {
                left.add(nameOfNewNode);
            } else {
                left = new Node(nameOfNewNode);
            }
        } else {
            if (rightNodeExists()) {
                right.add(nameOfNewNode);
            } else
            right = new Node(nameOfNewNode);
        }

    }

    private boolean leftNodeExists() {
        return left != null;
    }

    private boolean rightNodeExists() {
        return right != null;
    }

    public List<String> names() {
        List<String> sortedNamesList = new ArrayList<>();

        return sortNames(sortedNamesList);
    }

    private List<String> sortNames(List names) {
        if (leftNodeExists()) {
            left.sortNames(names);
        }

        names.add(name);

        if (rightNodeExists()) {
            right.sortNames(names);
        }

        return names;
    }

}
