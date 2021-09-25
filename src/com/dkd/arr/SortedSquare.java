package com.dkd.arr;

import java.util.Arrays;

public class SortedSquare {
    public static int [] square(int [] arr,int n){
        int [] res=new int[n];
        int i=0;
        int j=n-1;
        for(int k=n-1;k>=0;k--){
        if(Math.abs(arr[i])>Math.abs(arr[j])){
            res[k]=arr[i]*arr[i];
            i++;
        }else {
            res[k]=arr[j]*arr[j];
            j--;
        }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] data={-4,-1,0,2,3,7};
        int [] res=square(data,data.length);
        System.out.println(Arrays.toString(res));
    }
}
