package com.company;

import java.util.TreeSet;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String> str = new TreeSet<>();
        for (int i = 0 ; i < words.length ; i ++){
            StringBuilder stringBuilder = new StringBuilder();
            for(int j = 0 ; j < words[i].length() ; j++){
                int a = words[i].charAt(j)-97;
                stringBuilder.append(codes[a]);
            }
            str.add(stringBuilder.toString());
        }
        return str.size();
    }

}
