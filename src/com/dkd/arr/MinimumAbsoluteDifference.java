package com.dkd.arr;

import java.util.Arrays;
import java.util.Collections;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int arr[]={-59,-36,-13,1,-53,-92,-2,-96,-54,75};
        int minDiff=Integer.MAX_VALUE;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int diff=Math.abs(arr[i]-arr[i+1]);
            if(diff<minDiff)
                minDiff=diff;
        }
        System.out.println(minDiff);
    }
}
