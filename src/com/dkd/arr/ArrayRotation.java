package com.dkd.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {

        int n= a.size();
        List<Integer> res= new ArrayList<>();
        for(int i=d;i<n;i++){
            res.add(a.get(i));
        }
        if(res.size()<n){
            for(int j=0;j<d;j++){
                res.add(a.get(j));
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(rotLeft(Arrays.asList(1,2,3,4,5),1));
    }
}
