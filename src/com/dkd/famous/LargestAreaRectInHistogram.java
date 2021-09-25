package com.dkd.famous;

import java.util.Stack;

public class LargestAreaRectInHistogram {
    public static void main(String[] args) {
        int [] arr={6,2,5,4,5,1,6};
        int res=findLargestAreaRectangleHistogram(arr);
        System.out.println(res);
    }

    private static int findLargestAreaRectangleHistogram(int[] arr) {
        int maxArea=0;
        int n=arr.length;
        int[] rightSmall= new int[n];
        int [] leftSmall = new int[n];
        Stack<Integer> buff = new Stack<>();
        for(int i=0;i<n;i++){
            while(!buff.isEmpty()&&arr[i]<arr[buff.peek()]){
               buff.pop();
            }
            if(buff.isEmpty())leftSmall[i]=0;
            else leftSmall[i]=buff.peek()+1;
            buff.push(i);
        }
        buff.clear();
        for(int i=n-1;i>=0;i--){
            while(!buff.isEmpty()&&arr[i]<arr[buff.peek()]){
             buff.pop();
            }
            if(buff.isEmpty())rightSmall[i]=n-1;
            else rightSmall[i]=buff.peek()-1;
            buff.push(i);
        }
        for(int i=0;i<n;i++){
            maxArea=Math.max(maxArea,arr[i]*(rightSmall[i]-leftSmall[i]+1));
        }
        return maxArea;
    }

}
