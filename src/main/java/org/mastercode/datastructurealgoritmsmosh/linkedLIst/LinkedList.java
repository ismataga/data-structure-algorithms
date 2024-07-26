package org.mastercode.datastructurealgoritmsmosh.linkedLIst;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int index;



    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addFirst(int item) {

        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        index++;

    }

    public void addLast(int item) {

        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        index++;
    }

    public int indexOf(int item) {

        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }

        return -1;
    }


    public void deleteFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        index--;
    }

    public void deleteLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;

        } else {
            var previous = getNode(last);
            last = previous;
            last.next = null;
        }
        index--;
    }

    private Node getNode(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public boolean contains(int item) {
        var current = first;
        while (current != null) {
            if (current.value == item) return true;
            current = current.next;
        }
        return false;
    }

    public int size() {
        return index;
    }

    public void reverse() {
        if(isEmpty()) return;
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;

    }

    private boolean isEmpty() {
        return first == null;
    }


}
