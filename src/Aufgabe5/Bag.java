package Aufgabe5;

import java.util.Iterator;
import java.util.ListIterator;

public class Bag<Item> implements Iterable<Item> {
    private Node first; // first node in list

    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) { // same as push() in Stack
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private String toString(Node node) {
        if (node == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(node.item);
        stringBuilder.append("\n");
        if (node.next != null) {
            stringBuilder.append(toString(node.next));
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return toString(this.first);
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}