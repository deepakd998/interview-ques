package com.dkd.string;

import java.util.*;

public class SherlockValidString {
    public static void main(String[] args) {
        System.out.println(isValid("abcdefghhgfedecba"));
    }
    public static String isValid(String s) {
        String ans="No";
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Integer> values=new ArrayList<>(map.values());
        Collections.sort(values);
        int first=values.get(0);
        int second=values.get(1);
        int last=values.get(values.size()-1);
        int secondLast=values.get(values.size()-2);
        if(first==last)ans="YES";
        else if(first==1 && second ==last)ans="YES";
        else if(first==second&&second==secondLast&&(last-1)==secondLast)ans="YES";
        return ans;
    }
}
