package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer [] nums = {-2,0,3,-5,2,-1};
        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, ( a,b ) -> a + b);
        //System.out.println(segmentTree.toString());

        System.out.println(segmentTree.query(2,5));
    }
}
