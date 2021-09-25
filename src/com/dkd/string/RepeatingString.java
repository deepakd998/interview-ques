package com.dkd.string;

public class RepeatingString {
    public static void main(String[] args) {
        int numberOfCount=0;
        String s="aba";
        int n=10;
        for(char ch:s.toCharArray()){
            if((ch - 'a')==0){
                numberOfCount++;
            }
        }
        double total=n/s.length()*numberOfCount;
        System.out.println(total);

    }
}
