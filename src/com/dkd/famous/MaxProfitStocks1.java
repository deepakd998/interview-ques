package com.dkd.famous;

public class MaxProfitStocks1 {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,4,6,8,6};
       int minPrice=arr[0];
       int maxProfit=0;
        for (int j : arr) {
            minPrice = Math.min(minPrice, j);
            int profit = j - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        System.out.println(maxProfit);
    }
}
