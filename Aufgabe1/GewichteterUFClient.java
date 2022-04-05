import java.io.IOException;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;


public class GewichteterUFClient {

    public static void main(String[] args) throws IOException {
        performanceTest("resources//randInts05.txt");
        performanceTest("resources//randInts1.txt");
        performanceTest("resources//randInts4.txt");
        performanceTest("resources//randInts8.txt");
    }


    public static int[][] retrieveIntPairs(String filePath) {
        In file = new In(filePath);
        int[] initialArray = file.readAllInts();

        int[][] arr = new int[2][initialArray.length / 2];
        int n = 0, m = 0;

        for (int i = 0; i < initialArray.length; i++) {
            if (i % 2 == 0) {
                arr[0][m] = initialArray[i];
                m++;
            } else {
                arr[1][n] = initialArray[i];
                n++;
            }
        }
        return arr;


    }

    public static void performanceTest(String filePath) {
        int[][] initArray = retrieveIntPairs(filePath);

        int[] q = initArray[0];
        int[] p = initArray[1];

        GewichteterUF gewichteterUF = new GewichteterUF(initArray[0].length);

        Stopwatch stopwatch = new Stopwatch();

        for (int i = 0; i < initArray[0].length; i++) {
            if (!gewichteterUF.connected(p[i], q[i])) {
                gewichteterUF.union(p[i], q[i]);
            }
        }
        System.out.printf("Der Algorithmus braucht %.4f ms für %d Elemente\n", stopwatch.elapsedTime() * 1000, initArray[0].length * 2);
    }
}