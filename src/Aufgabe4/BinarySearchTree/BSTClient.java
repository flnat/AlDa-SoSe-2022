package Aufgabe4.BinarySearchTree;

public class BSTClient {
    public static void main(String[] args) {
        String[] see = new String[]{"B", "O", "D", "E", "N", "S", "E", "E"};
        BST<String, Integer> searchTree = new BST<>();

        for (int i = 0; i < see.length; i++) {
            searchTree.put(see[i], i);
        }

        System.out.println(searchTree);

    }
}
