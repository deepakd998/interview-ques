package com.dkd.string;

public class StringCompression {
    public static void main(String[] args) {
        String str="aaaabbcccdd";
        String str1="aaaabbcccddaa";
        String result= getMinimizedString(str);
        System.out.println("Result==> "+result);
    }
    public static String getMinimizedString(String str) {
        StringBuilder builder = new StringBuilder();
       int n=str.length();
        for(int i = 0; i< n; i++){
            char c=str.charAt(i);
            int count=1;
           while (i<n-1&&c==str.charAt(i+1)){
               count++;
               i++;
           }
           builder.append(c);
           builder.append(count);
        }
        return builder.toString();
    }
}
