package com.dkd.dp;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubArray {
    public static void main(String[] args) {
        int [] arr={4,3,-2,6,-12,7,-1,6};
       List<Integer> res=findMaxSumSubArray(arr,arr.length);
        System.out.println(res);
    }

    private static List<Integer> findMaxSumSubArray(int[] arr, int n) {
        List<Integer> maxSubArray= new ArrayList<>();
        int maxSum=arr[0];
        maxSubArray.add(arr[0]);
        List<Integer>  currSubArray= new ArrayList<>();
        currSubArray.add(arr[0]);
        int currentSum=arr[0];
        for(int i=1;i<n;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<arr[i]){
                currentSum=arr[i];
                currSubArray.clear();
            }
            currSubArray.add(arr[i]);
            if(maxSum<currentSum){
                maxSum=currentSum;
                maxSubArray.clear();
                maxSubArray.addAll(currSubArray);
            }
        }
        return maxSubArray;
    }
}
