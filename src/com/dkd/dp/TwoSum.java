package com.dkd.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
           if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i])){
               return new int[]{i,map.get(target-nums[i])};
           }
            map.put(nums[i],i);
        }
        return new int[2];
    }
    public static void main(String[] args) {
        int [] nums= { 5, 6, 5, 7};
        int target=13;
        System.out.println(Arrays.toString(new TwoSum().twoSum(nums,target)));
    }
}
