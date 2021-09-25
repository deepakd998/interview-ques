package com.dkd.dp;

public class MaxWaysCoinChange {
    public static void main(String[] args) {
     int[] a={3,5,10};
     int sum=20;
     int res=findMaxWays(sum,a);
        System.out.println(res);
    }

    private static int findMaxWays(int sum, int[] a) {
        int [] mem= new int[sum+1];
        mem[0]=1;
        for(int coin:a){
            for(int i=1;i<mem.length;i++){
                if(i>=coin){
                    mem[i]+=mem[i-coin];
                }
            }
        }
        return mem[sum];
    }
}
