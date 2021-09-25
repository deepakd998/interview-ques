package com.dkd.misc;

import java.util.*;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> res=new ArrayList<>();
        Map<String,Integer> map= new HashMap<>();
        for(String str:strings) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for(String str:queries){
            res.add(map.getOrDefault(str,0));
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> res=matchingStrings(new ArrayList<>(Arrays.asList("aba","baba","aba","xzxb")),new ArrayList<>(Arrays.asList("aba","xzxb","ab")));
        System.out.println(res);
    }
}
