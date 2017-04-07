package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

public class Node {
    public String name;
    public Node left;
    public Node right;

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

    public boolean leftNodeExists() {
        return left != null;
    }

    public boolean rightNodeExists() {
        return right != null;
    }

    public List<String> names() {
        return null;
    }
}
