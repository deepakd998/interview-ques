package com.dkd.famous;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheImpl {
    private int capacity;
    private Deque<Integer> deque;
    private Map<Integer,Integer> cacheMap;
    public LRUCacheImpl(int capacity) {
        this.capacity = capacity;
        this.deque=new LinkedList<Integer>();
        this.cacheMap=new HashMap<>();
    }
    public void add(int k,int v){
        if(cacheMap.containsKey(k)){
            deque.remove(k);
        }else {
         if(deque.size()==capacity){
             int e=deque.removeLast();
             cacheMap.remove(e);
         }
        }
        cacheMap.put(k,v);
        deque.addFirst(k);
    }
    public int get(int k){
        if(cacheMap.containsKey(k)){
            deque.remove(k);
            deque.addFirst(k);
            return cacheMap.get(k);
        }
        return -1;
    }
}
