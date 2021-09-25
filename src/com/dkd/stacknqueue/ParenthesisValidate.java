package com.dkd.stacknqueue;

import java.util.Stack;

public class ParenthesisValidate {
    public static void main(String[] args) {
        String data="([]{})";
        boolean result=isValid(data);
        System.out.println(result);
    }

    private static boolean isValid(String data) {
        if(data.charAt(0)=='}'||data.charAt(0)==')'||data.charAt(0)==']') return false;
        Stack<Character> stack= new Stack<>();
        for (char c:data.toCharArray()) {
            if(c=='{'||c=='['||c=='(')stack.push(c);
            else {
                switch (c){
                    case '}':{
                        if(stack.pop() != '{'){
                            return false;
                        }
                        break;
                    }
                    case ']':{
                        if(stack.pop() != '['){
                            return false;
                        }
                        break;
                    }
                    case ')':{
                        if(stack.pop() != '('){
                            return false;
                        }
                        break;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
