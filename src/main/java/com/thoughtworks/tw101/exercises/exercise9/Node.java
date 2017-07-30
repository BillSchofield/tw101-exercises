package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

public class Node {
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

//    public List<String> names() {
//        return null;
//    }

    public static void main(String[] args){
        Node root = new Node("Cecil");
        root.add("Michelle");
        root.add("Bill");
        root.add("Jagruti");
        System.out.println(root.left.name);
        System.out.println(root.right.name);
        System.out.println(root.right.left.name);

    }

}
