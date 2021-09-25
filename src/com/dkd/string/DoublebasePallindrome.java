package com.dkd.string;

public class DoublebasePallindrome {
    public static void main(String[] args) {
       for(int i=2;i<=89;i++){
           if(isPalindrome(Integer.toBinaryString(i))){
               System.out.println("i= "+i);
           }
       }
    }
    private static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
