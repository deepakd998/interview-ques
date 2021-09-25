package com.dkd.arr;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FindNoOfPairs {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(1);
        ar.add(3);
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(3);
        ar.add(3);
        ar.add(3);
        ar.add(3);
        int noOfPairs=0;
        for(int i=1;i<ar.size();i++){
                if(Objects.equals(ar.get(0), ar.get(i))){
                    noOfPairs++;
                    ar.remove(i);
                    ar.remove(0);
                    i=0;
                }else if(Objects.equals(i,ar.size()-1)){
                    ar.remove(0);
                    i=0;
                }
            }
System.out.println(noOfPairs);
    }
}
