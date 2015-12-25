package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node before;
    private Node after;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {

//        System.out.println("Now adding: " + nameOfNewNode);

        if (name.equals(nameOfNewNode)){ return; }

        int compareResult = name.compareTo(nameOfNewNode);

        if (compareResult < 0) {
            // then I come before newNode
            if (after == null) {
                after = new Node(nameOfNewNode);
            } else {
                after.add(nameOfNewNode);
            }
        } else if (compareResult > 0){
            // then I come after newNode
            if (before == null) {
                before = new Node(nameOfNewNode);
            } else {
                before.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        ArrayList<String> sortedResult = new ArrayList();

        // 1. Include all nodes, if any, that come before me.
        if (before != null) {
            sortedResult.addAll(before.names());
        }

        // 2. Include myself!
        sortedResult.add(name);

        // 3. Include all nodes, if any, that come after me.
        if (after != null) {
            sortedResult.addAll(after.names());
        }

        return sortedResult;
    }
}
