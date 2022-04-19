package utils;

public abstract class SortingAlgorithm {

    protected static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    protected static <T extends Comparable<T>> void exchange(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


}
