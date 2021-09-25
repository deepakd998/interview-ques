package com.dkd.arr;

public class MinimumSwaps {
    static int minimumSwaps(int[] arr) {
        int swaps=0;
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i] != i+1){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1]=temp;
                swaps++;
            }
            else{
                i++;
            }
        }
        return swaps;

    }
    public static void main(String[] args) {
        int [] arr={4,3,1,2};
        System.out.println("No of SWAPS== "+minimumSwaps(arr));
    }
}
/**{1,2,3,4}
 * i=1
 * n=4
 * temp=3
 * swaps=3
 */