package com.dkd.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static int getFirstNonRepeatingChar(String str){
        Map<Character,Integer> charMap= new HashMap<>();
        char [] charArr=str.toCharArray();
        for (char ch:charArr) {
           charMap.put(ch,charMap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<charArr.length;i++){
            char ch=str.charAt(i);
            if(charMap.get(ch)==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int res=getFirstNonRepeatingChar("aabbeff");
        System.out.println(res);
    }
}
