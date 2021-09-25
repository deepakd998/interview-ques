package com.dkd.famous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiftingWeights {
    public static void main(String[] args) {
         List<Integer> weights= new ArrayList<>();
         weights.add(4);
         weights.add(8);
         weights.add(5);
         weights.add(9);
         int maxCapacity=20;

        weights.sort(Collections.reverseOrder());
        System.out.println(weights);

        int liftingCapacity=0;
        int actualLiftingCapacity=0;
        for(int num:weights){
            for(int num1:weights){
                if(num==num1)
                    continue;
               if(liftingCapacity+num<=maxCapacity){
                   liftingCapacity+=num;
               }
            }
            if(liftingCapacity>actualLiftingCapacity){
                actualLiftingCapacity=liftingCapacity;
            }
            liftingCapacity=0;

        }
        System.out.println(actualLiftingCapacity);
    }
}
