package com.company;

import com.company.array.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* int[] arr = new int[20];

        for(int i=0;i<arr.length;i++){
            arr[i] = i;
        }
        int[] scores = new int[]{99,22,111};
        for (int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
        }
        scores[1]=89;
        for (int score:scores
             ) {
            System.out.println(score);
        }*/
        Array arr = new Array(20);
       for (int i=0;i<10;i++){
           arr.addLast(i);
       }
       arr.addLast(10);
       arr.addHead(-1);
       arr.add(1,100);
        System.out.println(arr);
    }
}
