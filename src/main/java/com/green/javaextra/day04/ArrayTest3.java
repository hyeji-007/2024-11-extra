package com.green.javaextra.day04;

import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 18, 22};
        //arr에 들어있는 값은 변화가 없는데
        //arr의 각 방의 값보다 +1이 된 새로운 배열을 만들어 주세요

        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] + 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
