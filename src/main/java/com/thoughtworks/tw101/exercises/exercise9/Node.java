package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;
    private Node parent;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        Node newNode = new Node(nameOfNewNode);
        if(name.compareTo(newNode.name) >= 1 && left == null){
            left = newNode;
        }
        else if(name.compareTo(newNode.name) <= -1 && right == null){
            right = newNode;
        }
    }

    public List<String> names() {
        return null;
    }

    public static void main(String[] args){
        Node root = new Node("Cecil");
        root.add("Michelle");
        root.add("Bill");

        System.out.println(root.left.name);
        System.out.println(root.right.name);
    }

}
