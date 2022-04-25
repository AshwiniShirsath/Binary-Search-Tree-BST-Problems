package com.bridgelabz.binarysearchtree;
/*
 * @author : Ashwini
 * Ability to create the binary tree shown in the figure
 * - Check if all are added with using size method in Binary Tree
 */
class Node <T extends Comparable<T>> {
    public T key;
    public int value;
    public Node next;

    //Node Constructor for Creating New Node
    Node(T key) {
        this.key = key;
        this.value = 1;
        this.next = null;
    }
}
