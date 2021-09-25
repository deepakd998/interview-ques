package com.dkd.string;
/*
Longest common substring in binary representation of two numbers
Input : n = 10, m = 11
Output : 5
Explanation : Binary representation of
10 -> 1010
11 -> 1011
longest common substring in both is 101
and decimal value of 101 is 5
 */
public class LongestCommSubStrInBinaryOfTwoNum {
    public static void main(String[] args) {
        int m=8;
        int n=16;
        String maxString="";
        int maxLength=Integer.MIN_VALUE;
        String s1=Integer.toBinaryString(m);
        String s2= Integer.toBinaryString(n);
        int len=s1.length();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                String subs=s1.substring(i,j);
                int tLen=subs.length();
                if(tLen>maxLength && s2.contains(subs)){
                    maxLength=tLen;
                    maxString=subs;
                }
            }
        }
        if(maxString.equals("")) {
            System.out.println(-1);
        }else {
            System.out.println(maxString);
            System.out.println(Integer.parseInt(maxString, 2));
        }
    }
}
