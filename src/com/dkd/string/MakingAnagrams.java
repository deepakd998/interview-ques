package com.dkd.string;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {
    public static void main(String[] args) {
       String s1="cded";
       String s2="abcd";
       int removeCount=0;
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
        }
        for(Integer val:map.values()){
            removeCount+=Math.abs(val);
        }
        System.out.println(removeCount);
    }
}
