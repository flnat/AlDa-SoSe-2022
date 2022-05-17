package Aufgabe4.MaxHeap;


public class MaxHeapClient {
    public static void main(String[] args) {
        String[] letters = new String[]{"K", "O", "N", "S", "T", "A", "N", "Z"};
        MaxHeap maxHeap = new MaxHeap(letters.length);

        for (String letter : letters) {
            maxHeap.insert(letter);
        }

        Heapsort.sort(maxHeap.pq);
        String[] new_letters = maxHeap.pq;

        for (String letter : new_letters) {
            System.out.println(letter);
        }


    }
}
