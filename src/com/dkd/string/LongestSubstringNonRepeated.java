package com.dkd.string;
/*
Longest substring in a string with non repeated chars
String s="gefdgkedeflk" ans="gefdgk" length =6
 */
public class LongestSubstringNonRepeated {
    public static void main(String[] args) {
        String s="aaaabedccccc";
        String maxSubstring="";
        StringBuilder ans= new StringBuilder();
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            String c= String.valueOf(s.charAt(i));
            if(ans.toString().contains(c)){
                ans = new StringBuilder("");
            }else{
                ans.append(c);
            }
            if(ans.length()>maxLength){
                maxLength=ans.length();
                maxSubstring=ans.toString();
            }
        }
        System.out.println(maxLength);
        System.out.println(maxSubstring);
    }
}
