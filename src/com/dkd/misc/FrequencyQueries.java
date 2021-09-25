package com.dkd.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQueries {
    public static void main(String[] args) {

    }
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> res= new ArrayList<>();
        Map<Integer,Integer>map= new HashMap<>();
        Map<Integer,Integer>freqMap= new HashMap<>();
        for(List<Integer> q:queries){
            int opt=q.get(0);
            int v=q.get(1);
            int freq=map.getOrDefault(v,0);
            if(opt==1){
                if(freq>0){
                    freqMap.put(freq,freqMap.get(freq)-1);
                }
                map.put(v,freq+1);
                freqMap.put(map.get(v),freqMap.getOrDefault(map.get(v),0)+1);
            }else if(opt==2 && freq>0){
                map.replace(v,freq-1);
                freqMap.put(freq,freqMap.get(freq)-1);
                freqMap.put(map.get(v),freqMap.getOrDefault(map.get(v),0)+1);
            }else if(opt==3){
                if((freqMap.getOrDefault(v,0))>0){
                    res.add(1);
                }else{
                    res.add(0);
                }
            }
        }
        return res;
    }
}
