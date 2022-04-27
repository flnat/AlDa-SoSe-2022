package Aufgabe3.QuickSort;

import utils.SortingAlgorithm;
import edu.princeton.cs.algs4.StdRandom;

public class QuickSort extends SortingAlgorithm {
    public static <T extends Comparable<T>> void sort(T[] a) {
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

        while (true) {
            while (a[--j].compareTo(a[low]) > 0) {
                if (j == low) {
                    break;
                }
            }
            while (a[++i].compareTo(a[low]) < 0) {
                if (i == high) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
        }

        exchange(a, low, j);
        return j;
    }
}
