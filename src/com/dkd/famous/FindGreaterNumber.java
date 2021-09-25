package com.dkd.famous;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class  FindGreaterNumber {
    public static void main(String[] args) {
        int [] nums={1,7,5,4,3,6};
        int n=nums.length;
        int[] res=new int[nums.length];
        Arrays.fill(res,-1);
        Stack<Integer> buff= new Stack<>();
        for(int i=0;i<2*n-1;i++){
            while (!buff.isEmpty()&&nums[i%n]>nums[buff.peek()]){
                res[buff.pop()]=nums[i%n];
            }
            buff.push(i%n);
        }
        System.out.println(Arrays.toString(res));
    }
}
