package com.dkd.arr;
/*
logest subbarray length with increamental [2,4,5,3,9,7,8,2,1,4] -=  answer 4
 */
public class LongestSubArrayIncremental {
    public static void main(String[] args) {
        int[] arr={2,4,5,5,6,7,8,9,1,4};
        int n=arr.length;
        int maxLength=-1;
        for(int i=0;i<n;i++){
            int currCount=1;
            System.out.print(arr[i]+" ");
            while (i+1<n&&arr[i+1]>arr[i]){
                i++;
                currCount++;
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            maxLength=Math.max(maxLength,currCount);
        }
        System.out.println("Max==> "+maxLength);

    }
}
