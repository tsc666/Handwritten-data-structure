package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Random random = new Random();
        /*int[] nums = {5,3,6,8,4,2};
        for (int num: nums){
            bst.add(num);
        }*/
        //bst.preOrder();
        //System.out.println();
        /*bst.inOrder();
        System.out.println();
        bst.postOrder();*/
        //System.out.println(bst);
        //bst.preOrderNR();
        /*bst.levelOrder();
        System.out.println(bst.mininum());
        System.out.println(bst.maxinum());*/
        int n = 1000;
        for(int i = 0; i < n ; i ++){
            bst.add(random.nextInt(10000));
        }
        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty()){
            nums.add(bst.removeMin());
        }
        System.out.println(nums);
    }
}
