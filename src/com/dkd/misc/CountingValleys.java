package com.dkd.misc;

public class CountingValleys {
    public static void main(String[] args) {
        String path="UDDDUDUU";
        int lvl=0;
        int vl=0;
        for(char c:path.toCharArray()){
            if(c == 'U') ++lvl ;
            else --lvl;
            if(lvl==0 && c=='U'){
                vl++;
            }
        }
        System.out.println(vl);
    }
}
