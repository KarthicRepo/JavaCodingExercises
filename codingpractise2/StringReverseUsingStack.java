package com.java.learning.codingpractise2;

import java.util.Stack;

public class StringReverseUsingStack {
    public static void main(String[] args) {
        String text="abcdefghijklmn";
        reverseString(text);
    }

    static private void reverseString(String str){
        Stack<String> stack= new Stack<>();
        for(char ch:str.toCharArray()){
            stack.push(ch+"");
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());

    }
}
