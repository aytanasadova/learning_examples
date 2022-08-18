package main.java.Array;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int arr[] = new int[]{2, 5, 7, 3, 1};

//      sort1(arr);
        sort2(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void sort1(int[] arr) {

        int m;

        for (int i = 0; i < arr.length; i++)
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] > arr[k]) {
                    m = arr[i];
                    arr[i] = arr[k];
                    arr[k] = m;
                }
            }
    }

    static void sort2(int[] arr) {
        Arrays.sort(arr);
    }


}
