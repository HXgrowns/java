package com.thoughtworks;

import java.util.ArrayList;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        ArrayList<Integer> newArray = new ArrayList<Integer>();

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
