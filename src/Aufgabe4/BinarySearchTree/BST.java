package Aufgabe4.BinarySearchTree;

public class BST<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node {
        private Key key;
        private Value value;
        private Node left, right;
        private int n; //Unterliegende Tiefe

        public Node(Key key, Value value, int n) {
            this.key = key;
            this.value = value;
            this.n = n;
        }

        @Override
        public String toString() {
            return String.format("%s: %s", this.key.toString(), this.value.toString());
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.n;
        }
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node node, Key key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return get(node.left, key);
        } else if (cmp > 0) {
            return get(node.right, key);
        } else {
            return node.value;
        }
    }

    public void put(Key key, Value val) {
        root = put(root, key, val);
    }

    private Node put(Node node, Key key, Value value) {
        if (node == null) {
            return new Node(key, value, 1);
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = put(node.left, key, value);
        } else if (cmp > 0) {
            node.right = put(node.right, key, value);
        } else {
            node.value = value;
        }
        node.n = size(node.left) + size(node.right) + 1;
        return node;
    }

    private String toString(Node node, int indent) {
        StringBuilder stringBuilder = new StringBuilder();
        if (node == null) {
            return "";
        }
        for (int i = 0; i < indent; i++) {
            stringBuilder.append("\t");
        }
        stringBuilder.append(node);
        if (node.left != null) {
            stringBuilder.append("\n");
            stringBuilder.append(toString(node.left, indent + 1));
        }
        if (node.right != null) {
            stringBuilder.append("\n");
            stringBuilder.append(toString(node.right, indent + 1));
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return toString(this.root, 0);
    }

}






