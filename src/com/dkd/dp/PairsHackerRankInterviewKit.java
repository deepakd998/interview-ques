package com.dkd.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given an array of integers and a target value, determine the number of pairs of array elements that have a difference
equal to the target value.
Example
t=2;
arr = [1, 5, 3, 4, 2]
ans=3;
 */
public class PairsHackerRankInterviewKit {
    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(1, 5, 3, 4, 2);
        int target=2;
        int count=0;
        Map<Integer,Integer> nums= new HashMap<>();
        for(Integer i:arr){
            nums.put(i,nums.getOrDefault(i,0)+1);
        }
        for(Integer i:arr){
            if(nums.containsKey(i+target)){
                count++;
            }
        }
        System.out.println(count);
    }
}
