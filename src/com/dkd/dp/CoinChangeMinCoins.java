package com.dkd.dp;

import java.util.Arrays;

public class CoinChangeMinCoins {
    public static void main(String[] args) {
        int [] arr={1,5,7};
        int n=18;
        int [] mem= new int[n+1];
        Arrays.fill(mem,-1);
        mem[0]=0;
        int res=minCoins(arr,n,mem);
        System.out.println(res);
        System.out.println(Arrays.toString(mem));
    }

    private static int minCoins(int[] arr, int n, int[] mem) {
        int ans=Integer.MAX_VALUE;
        if (n == 0) return 0;
        for (int j : arr) {
            if (n - j >= 0) {
                int subAns = 0;
                if (mem[n - j] != -1) {
                    subAns = mem[n - j];
                } else {
                    subAns = minCoins(arr, n - j, mem);
                }
                if (subAns != Integer.MAX_VALUE && (subAns + 1) < ans) {
                    ans = subAns + 1;
                }
            }
        }
       return mem[n] = ans;
    }
}
