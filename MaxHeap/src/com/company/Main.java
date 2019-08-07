package com.company;

import java.util.Random;

public class Main {

    private static double testHeap(Integer[] testData,boolean isHeapify){

        long startTime = System.nanoTime();
        MaxHeap<Integer> maxHeap;
        if (isHeapify == true){
            maxHeap = new MaxHeap<>(testData);
        }
        else {
            maxHeap = new MaxHeap<>();
            for (int num:testData){
                maxHeap.add(num);
            }
        }
        int [] arr = new int[testData.length];
        for (int i = 0 ; i < testData.length ; i ++){
            arr[i] = maxHeap.extractMax();
        }
        for (int i = 1 ; i < testData.length ; i ++){
            if (arr[i - 1] < arr[i]){
                throw new IllegalArgumentException("error");
            }
        }
        System.out.println("佟帅辰NB");

        long endTime = System.nanoTime();
        return (endTime - startTime)/1000000000.0;
    }

    public static void main(String[] args) {
	// write your code here
        int n = 1000000;

        Random random = new Random();
        Integer[] testDate = new Integer[n];
        for (int i = 0; i < n ; i ++)
            testDate[i] = random.nextInt(Integer.MAX_VALUE);
        double time1 = testHeap(testDate,false);
        System.out.println("不使用heapift" + time1 + 's');
        double time2 = testHeap(testDate,true);
        System.out.println("使用heapify" + time2 + 's');
    }
}
