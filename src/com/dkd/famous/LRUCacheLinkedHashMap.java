package com.dkd.famous;

import java.util.LinkedHashMap;
import java.util.Map;

 class LRUCache {
    private int capacity;
    private LinkedHashMap<Integer,Integer> cacheMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap=new LinkedHashMap<Integer,Integer>(capacity,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }
   public void set(int k,int v){
   cacheMap.put(k,v);
   }
    public int get(int k){
       return cacheMap.getOrDefault(k, -1);
    }
    public void print(){
        cacheMap.forEach((key, value) -> System.out.println("k=>" + key + " v " + value));
    }
}
public class LRUCacheLinkedHashMap {
    public static void main(String[] args) {
   LRUCache cache = new LRUCache(3);
   cache.set(1,2);
   cache.set(2,6);
   cache.set(1,3);
   cache.set(2,0);
   cache.set(4,9);
  System.out.println(cache.get(1));
  System.out.println(cache.get(2));
  cache.set(5,2);
  cache.print();
    }
}
