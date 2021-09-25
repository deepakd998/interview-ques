package com.dkd.dp;

import java.util.HashMap;
import java.util.Map;

public class ProfitTarget {
    public static void main(String[] args) {
        int [] profits={ 5, 6, 5, 7, 7, 8 };
        int target=13;
        int count=0;
        Map<Integer,Integer> countMap= new HashMap<>();
        for (int profit : profits) {
            countMap.put(profit, countMap.getOrDefault(profit, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry:countMap.entrySet()){
            int k=entry.getKey();
            if(2*k==target){
                if(countMap.get(k)>1)count+=2;
            }else if(countMap.containsKey(target-k))count+=1;
        }
        count=count/2;
        System.out.println(count);
    }
}
