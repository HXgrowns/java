package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice4 {
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        List<Integer> newArray = new ArrayList<Integer>();

        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if(flag && number <= array[i]) {
                newArray.add(number);
                flag = false;
            }
            newArray.add(array[i]);
        }

        if(flag) {
            newArray.add(number);
        }

        int[] result = newArray.stream().mapToInt(Integer::valueOf).toArray();

        return result;
    }
}
