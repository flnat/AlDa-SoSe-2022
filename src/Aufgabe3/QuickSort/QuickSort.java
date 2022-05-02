package Aufgabe3.QuickSort;

import utils.SortingAlgorithm;
import edu.princeton.cs.algs4.StdRandom;

public class QuickSort extends SortingAlgorithm {
    public static <T extends Comparable<T>> void sort(T[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    public static <T extends Comparable<T>> void sort(T[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int j = partition(a, low, high);
        sort(a, low, j - 1);
        sort(a, j + 1, high);
    }

    public static <T extends Comparable<T>> int partition(T[] a, int low, int high) {
        int i = low;
        int j = high + 1;

        T pivotElement = a[low];

        while (true) {
            while (less(a[++i], pivotElement)) {
                if (i == high) {
                    break;
                }
            }
            while (less(pivotElement, a[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exchange(a, i, j);
        }
        exchange(a, low, j);
        return j;

    }
}
