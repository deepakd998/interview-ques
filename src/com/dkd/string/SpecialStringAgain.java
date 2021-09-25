package com.dkd.string;

public class SpecialStringAgain {
    public static void main(String[] args) {
        String s="mnonopoo";
        int n=s.length();
        long count=n;
        for(int i=0;i<n;i++){
            int repeat=0;
            while(i+1<n && s.charAt(i)==s.charAt(i+1)){
                i++;
                repeat++;
            }

            count+=(repeat*(repeat+1))/2;
            int pointer=1;
            while(i-pointer>=0&&i+pointer<n&&s.charAt(i+pointer)==s.charAt(i-1)&&s.charAt(i-pointer)==s.charAt(i-1)){
                count++;
                pointer++;
            }
        }
        System.out.println("Count== "+count);
    }
}
