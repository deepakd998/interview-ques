package com.dkd.arr;

public class FindMissingNumberFromArr {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,8,9};
        int res=findMissingElementMethod1(arr,arr.length);
        System.out.println(res);
    }

    private static int findMissingElementMethod1(int[] arr, int n) {
        int sum=(n+1)*(n+2)/2;
        for(int i=0;i<n;i++){
            sum-=arr[i];
        }
        return sum;
    }
}
