package com.thoughtworks;

public class ArrayPractice2 {
    public static int[] exchange() {
        int[] array = new int[]{10, 8, 1, 7, 0, 20, 16, 19};
        int max = array[0];
        int maxId = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxId = i;
            }
        }

        int temp = array[0];
        array[0] = array[maxId];
        array[maxId] = temp;
        return array;
    }
}
