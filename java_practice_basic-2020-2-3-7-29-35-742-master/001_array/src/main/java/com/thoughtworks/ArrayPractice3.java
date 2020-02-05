package com.thoughtworks;

import java.util.ArrayList;

public class ArrayPractice3 {
    public static int[] filterZero(int[] array) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                num++;
                newArray.add(array[i]);
            }
        }

        int[] result = newArray.stream().mapToInt(Integer::valueOf).toArray();

        return result;
    }
}
