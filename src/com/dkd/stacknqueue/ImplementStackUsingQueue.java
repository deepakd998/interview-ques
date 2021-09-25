package com.dkd.stacknqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    public static void main(String[] args) {
Stack stack= new Stack();
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
    static class Stack{
     Queue<Integer> queue;
        public Stack() {
            this.queue = new LinkedList<>();
        }

        public void push(Integer e){
            queue.add(e);
           for(int i=0;i<queue.size()-1;i++){
               queue.add(queue.poll());
           }
        }
        public Integer peek(){
            if(queue.isEmpty()) return null;
            return queue.peek();
        }
        public Integer pop(){
            if(queue.isEmpty()) return null;
            return queue.poll();
        }
    }
}
