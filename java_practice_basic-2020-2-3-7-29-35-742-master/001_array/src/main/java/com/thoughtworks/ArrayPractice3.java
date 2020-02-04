package com.thoughtworks;

import java.util.ArrayList;

public class ArrayPractice3 {

    /**
     * 完成本方法实现功能: 将一个整型数组array中值0的元素去掉，并把剩下的元素组成新的数组
     */
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
