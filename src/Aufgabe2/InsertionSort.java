package Aufgabe2;

public class InsertionSort extends SortingAlgorithm {
    //Implementiert nach Sedgewick - Algorithms Kapitel 2

    public static <T extends Comparable<T>> T[] sort(T[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exchange(a, j, j - 1);
            }
        }
        return a;
    }
}
