package com.dkd.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockANDAnagrams {
    public static void main(String[] args) {
        String s = "kkkk";
        int n = s.length();
        Map<String,Integer> map= new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <=n; j++) {
                char[] c=s.substring(i,j).toCharArray();
                Arrays.sort(c);
                String str=new String(c);
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        int count=0;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            int v=entry.getValue();
            count+=(v*(v-1))/2;
        }

        System.out.println("Count"+count);
    }
}
