package Aufgabe4.MaxHeap;

public class MaxHeap {
    public String[] pq;
    private int n;

    public MaxHeap(int capacity) {
        pq = new String[capacity];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public String delMax() {
        return pq[--n];
    }


    public void insert(String key) {
        int i = n - 1;
        while (i >= 0 && less(key, pq[i])) {
            pq[i + 1] = pq[i];
            i--;
        }
        pq[i + 1] = key;
        n++;
    }

    private boolean less(String v, String w) {
        return v.compareTo(w) < 0;
    }


}