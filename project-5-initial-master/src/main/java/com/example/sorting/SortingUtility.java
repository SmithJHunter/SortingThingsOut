package com.example.sorting;

public class SortingUtility {

    //Part A
    public static <T extends Comparable<T>> void gnomeSort(T[] data) {
        int i = 0;
        int n = data.length;
        while (i < n) {
            if (i == 0 || data[i].compareTo(data[i - 1]) > 0) {
                i++;
            } else {
                T tmp = data[i];
                data[i] = data[i - 1];
                data[--i] = tmp;
            }
        }
    }
    //Part B
    public static <T extends Comparable<T>> void gnomierSort(T[] data) {
        for (int pos = 0; pos < data.length; pos++) {
            gnomierSort(data, pos);
        }
    }

   //Part C
    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {
        int i = upperBound;
        while (i > 0 && data[1].compareTo(data[i - 1]) < 0){
            T tmp = data[i];
            data[i] = data[i - 1];
            data [--i] = tmp;
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





