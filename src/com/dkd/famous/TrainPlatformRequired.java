package com.dkd.famous;

import java.util.Arrays;

/*
Find minimum number of plat form required  in a station for Arraival= [9.00,9.10,10.15,14.30] & Dep [9.40, 9.50,12.00, 16.00]
 */
public class TrainPlatformRequired {
    public static void main(String[] args) {
        int [] arr={900,910,1015,1430}; //sorted={900,910,1015,1430}
        int [] dep={940,950,1200,1600};  //sorted={940,950,1200,1600};
        int i=1,j=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;
        int res=1;
        int pltCount=1;
        while (i<n&&j<n){
            if(arr[i]<=dep[j]){
                i++;
                pltCount++;
            }
            else{
                pltCount--;
                j++;
            }
           res=Math.max(res,pltCount);
        }
        System.out.println(res);
    }

}
