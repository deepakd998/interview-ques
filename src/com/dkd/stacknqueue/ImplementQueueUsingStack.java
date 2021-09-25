package com.dkd.stacknqueue;

import java.util.Stack;

public class ImplementQueueUsingStack {
    public static void main(String[] args) {
     Queue queue = new Queue();
     queue.add(2);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(3);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
    static class Queue{
        Stack<Integer> s1,s2;

        public Queue() {
            s1=new Stack<>();
            s2=new Stack<>();
        }
        public void add(Integer e){
            s1.push(e);
        }
        public Integer peek(){
            if(s1.isEmpty() && s2.isEmpty())return null;
            if (s2.empty()) {
                while (!s1.empty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }
        public Integer poll(){
            if(s1.isEmpty()&& s2.isEmpty())return null;
            if (s2.empty()) {
                while (!s1.empty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }
    }
}
