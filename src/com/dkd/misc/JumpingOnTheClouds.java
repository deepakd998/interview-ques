package com.dkd.misc;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        List<Integer> c= new ArrayList<>();
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        System.out.println(c);
        int steps=-1;
        for (int i = 0; i<c.size(); i++) {
         if(i<c.size()-2&&c.get(i+2)==0){
                i++;
            }
            steps++;
        }
        System.out.println(steps);
    }
}
