package com.dkd.string;
/*
Find the longest palindromic substrings  -> racecarnayakanna =>[racecar, aya, anna] => 5
 */
public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s = "aaaabbaa";
        int n = s.length();
        int res=0;
        String subs="";
        for (int i = 0; i <n;i++){
            for(int j=i+1;j<=n;j++){
                String str=s.substring(i,j);
                if(isPalindrome(str)){
                    res=Math.max(str.length(),res);
                    subs=subs.length()>str.length()?subs:str;
                }
            }
        }
        System.out.println("res ==>"+res);
        System.out.println("subs==>"+subs);
     String result=new LongestPalindromeSubstring().findLargePalindrome(s);
        System.out.println(result);
    }

    private static boolean isPalindrome(String str) {
        int mid=str.length()/2;
        for(int i=0;i<mid;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
        }
         return true;
    }
    int resStart,resLength;
    public  String findLargePalindrome(String s){
      int n=s.length();
      if(n<2)return s;
      for(int i=0;i<n-1;i++){
          checkPalindrome(s,i,i);
          checkPalindrome(s,i,i+1);
      }
      return s.substring(resStart,resStart+resLength);
    }

    private  void checkPalindrome(String s, int begin, int end) {
        while (begin>=0&&end<s.length()&&s.charAt(begin)==s.charAt(end)){
            begin--;
            end++;
        }
        if(resLength<end-begin-1){
            resLength=end-begin-1;
            resStart=begin+1;
        }
    }
}
