package com.company;
import java.util.Stack;
public class Solution2 {
    public String removeOuterParentheses(String S) {
        int num = 0;
        Stack<Character> res = new Stack<Character>();
        char [] stack = new char [10000];
        int j = 1;
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(c=='('){
                stack[i]=c;
                num ++;
            }else if(c == ')'){
                stack[i]=c;
                num --;
            }
            if(num == 0){
                for(int a = j;a<=i-1;a++){
                    res.push(stack[a]);
                }
                j = i + 2;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int b=0;b<res.size();b++){
            stringBuilder.append(res.get(b));
        }
        return stringBuilder.toString();
    }
    public static void main(String args[]){
        System.out.println(new Solution2().removeOuterParentheses("(()())(())"));
    }
}
