package com.dkd.arr;

import java.util.Arrays;

/*
an array  [22, 24, 23, 21, 28] - arrange odd number and odd index and even at even index
 */
public class EvenOddIndex {
    public static void main(String[] args) {
        int[] arr={22, 24, 23, 21, 28};
        int [] res= new int[arr.length];
        int even=0;
        int odd=1;
        for (int j : arr) {
            if (j % 2 == 0) {
                res[even] = j;
                even += 2;
            } else {
                res[odd] = j;
                odd += 2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
