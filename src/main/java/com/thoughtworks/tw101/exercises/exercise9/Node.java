package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private ArrayList<String> namesList = new ArrayList<>();
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if(name.compareTo(nameOfNewNode) >= 1){
            if(left == null){
                left = new Node(nameOfNewNode);
            } else {
                left.add(nameOfNewNode);
            }
        }
        else if(name.compareTo(nameOfNewNode) <= -1){
            if(right == null){
                right = new Node(nameOfNewNode);
            } else {
                right.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        if (left != null) {
            namesList.addAll(left.names());
        }
        namesList.add(name);
        if(right != null) {
            namesList.addAll(right.names());
        }
        return namesList;
    }

}
