package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice4 {
    public static void main(String[] args) {
        insert(2);
    }
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        List<Integer> newArray = new ArrayList<Integer>();

        boolean isInsert = true;
        for (int i = 0; i < array.length; i++) {
            if(isInsert && number <= array[i]) {
                newArray.add(number);
                isInsert = false;
            }
            newArray.add(array[i]);
        }

        if(isInsert) {
            newArray.add(number);
        }

        int[] result = newArray.stream().mapToInt(Integer::valueOf).toArray();

        return result;
    }
}
