package com.dkd.arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
[1,3,9,9,27,81]
how many triplets present {geometric progression like 1,3,9 and 9,27,81 has by ratio 3
 */
public class CountTriplets {
    public static void main(String[] args) {
      countTriplets(Arrays.asList(1L,3L,9L,9L,27L,81L),3);
    }
    static long countTriplets(List<Long> arr, long r) {
        long tripletsCount=0;
        int n=arr.size();
        Map<Long,Long> before= new HashMap<>();
        Map<Long,Long> after= new HashMap<>();
        for(int i=0;i<n;i++){
            after.put(arr.get(i),after.getOrDefault(arr.get(i),0L)+1);
        }
        for(int i=0;i<n;i++){
            Long count= after.get(arr.get(i));
            after.put(arr.get(i),count-1);
            if(arr.get(i)%r==0&&before.containsKey(arr.get(i)/r)
                    &&after.containsKey(arr.get(i)*r)){
                tripletsCount+=before.get(arr.get(i)/r)*after.get(arr.get(i)*r);
            }
            before.put(arr.get(i),before.getOrDefault(arr.get(i),0L)+1);
        }
        return tripletsCount;
    }
}
