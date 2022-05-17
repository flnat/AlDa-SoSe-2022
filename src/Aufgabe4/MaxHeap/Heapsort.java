package Aufgabe4.MaxHeap;

import edu.princeton.cs.algs4.StdOut;
public class Heapsort {

    public static void sort(String[] pq){
        int n = pq.length;

        for (int k = n/2; k >=1; k--){
            sink(pq, k, n);
        }
        int k = n;
        while (k >1){
            exchange(pq,1,k--);
            sink(pq, 1, k);
        }
    }
    private static void sink(String[] pq, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(pq, j, j+1)) j++;
            if (!less(pq, k, j)) break;
            exchange(pq, k, j);
            k = j;
        }
    }    private static boolean less(String[] pq, int i, int j) {
        return pq[i-1].compareTo(pq[j-1]) < 0;
    }

    private static void exchange(Object[] pq, int i, int j) {
        Object swap = pq[i-1];
        pq[i-1] = pq[j-1];
        pq[j-1] = swap;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }
}