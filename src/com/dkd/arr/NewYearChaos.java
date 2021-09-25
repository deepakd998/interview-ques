package com.dkd.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewYearChaos {
    public static void main(String[] args) {
       minimumBribes(new ArrayList<>(Arrays.asList(1,2,5,4,3)));
    }
    public static void minimumBribes(List<Integer> q) {
        int totalBribes=0;
        for(int i=q.size()-1;i>=0;i--){
            if(q.get(i)!=i+1){
                if((i-1)>=0&&q.get(i-1)==i+1){
                    int temp=q.get(i-1);
                    q.set(i-1,q.get(i));
                    q.set(i,temp);
                    totalBribes++;
                }
                else if((i-2)>=0&&q.get(i-2)==i+1){
                    int temp=q.get(i-2);
                    q.set(i-2,q.get(i-1));
                    q.set(i-1,q.get(i));
                    q.set(i,temp);
                    totalBribes+=2;
                }
                else{
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }

        System.out.println(totalBribes);

    }
}
