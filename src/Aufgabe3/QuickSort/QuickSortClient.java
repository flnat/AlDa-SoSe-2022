package Aufgabe3.QuickSort;



public class QuickSortClient {
    public static void main(String[] args) {
        String[] test_arr = new String[]{"H", "a", "p", "pi", "n", "e", "s", "s"};
        QuickSort.sort(test_arr);
        for (String string: test_arr) {
            System.out.println(string);
        }
    }
}
