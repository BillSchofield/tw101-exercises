package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;
    private String parent;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        boolean placed = false;
        Node newNode = new Node(nameOfNewNode);
        while (!placed){
            if(name.compareTo(newNode.name) >= 1 && left == null){
                left = newNode;
                placed = true;
            }
            else if(name.compareTo(newNode.name) <= -1 && right == null){
                right = newNode;
                placed = true;
            }
        }
    }

    public List<String> names() {
        return null;
    }

    public static void main(String[] args){
        Node root = new Node("Cecil");
        root.add("Michelle");
        root.add("Bill");
//        root.add("Jagruti");
        System.out.println(root.left.name);
        System.out.println(root.right.name);
    }

}
