package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("tsc");
        ArrayList<String> words1 = new ArrayList<>();
        FileOperation.readFile("dkm.txt",words1);
        System.out.println("Total words: " + words1.size());
    }
}
