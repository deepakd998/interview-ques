package com.dkd.stacknqueue;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(2);
        s.push(7);
        s.push(1);
        s.push(4);

        Stack<Integer> sorted= sortStack(s);
        sorted.forEach(System.out::println);
    }

    private static Stack<Integer> sortStack(Stack<Integer> s) {
        Stack<Integer> sorted= new Stack<>();
        while (!s.isEmpty()){
            int temp=s.pop();
            while (!sorted.isEmpty() && temp>sorted.peek()){
                s.push(sorted.pop());
            }
            sorted.push(temp);
        }
        return sorted;
    }
}

/*
sorted{1,2,7,4}
unsorted{1}
 */