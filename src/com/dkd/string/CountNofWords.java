package com.dkd.string;

import java.util.Scanner;

public class CountNofWords {
    public static void main(String[] args) {
        String s = "oneTwoThree";
        char[] chars=s.toCharArray();
        int count=1;
        for(int i=0;i<chars.length;i++){
            if(chars[i] >= 65 && chars[i]<=90){
                count++;
            }
        }
        System.out.println(count);
    }
}
