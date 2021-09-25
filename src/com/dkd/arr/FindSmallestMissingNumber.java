package com.dkd.arr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Smallest positive missing number Greater than zero
[-1,0,5,6,2,-3,4,3] ans = 1
[-1,-3,-2] ans=1
 */
public class FindSmallestMissingNumber {
    public static void main(String[] args) {
    int[] arr={2,3,4,1};
        int n=arr.length;
        findMissingONSpace(arr, n);

    }

    private static void findMissingONSpace(int[] arr, int n) {
        int missing=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();
        for(int i = 0; i< n; i++) {
           set.add(arr[i]);
        }
        for(int i = 0; i< n; i++){
            if(!set.contains(i+1)){
                missing=i+1;
                break;
            }
        }
        if(missing == Integer.MIN_VALUE) missing= n +1;
        System.out.println(missing);
    }
}
