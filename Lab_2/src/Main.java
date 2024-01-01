import java.io.*;
import java.util.*;

public class Main {
    public static Map.Entry<Integer, Integer> getMinMax(int[] arr) {
        int min= arr[0], max = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(min,max);

        for (Map.Entry<Integer, Integer> entry: myMap.entrySet()) {
            return entry;
        }
        return null;
    }
    public static int binarySearch(int[] arr) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length;
        while (start < end) {
            
        }
        return 0;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[1000];
        for (int i=0;i<1000;i++) {
            arr[i] = rand.nextInt(1001);
        }
        long currtime = System.nanoTime();
        Map.Entry<Integer,Integer> minMax = getMinMax(arr);
        System.out.println("Time taken in nano: " + (System.nanoTime() - currtime));
        System.out.println("Min: "+minMax.getKey());
        System.out.println("Max: "+minMax.getValue());

    }

}