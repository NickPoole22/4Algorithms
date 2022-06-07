package com.company;
import java.util.Random;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	Random rand = new Random();
    int[] list = new int[12];

    for(int i = 0; i < list.length; i++){
        list[i] = rand.nextInt(100);
    }

    System.out.println("Unsorted list:");
    System.out.println(Arrays.toString(list));

    insertionSort(list);
    System.out.println("After sorting:");
    System.out.println(Arrays.toString(list));

    }
    public static void insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){
            int currentValue = list[i];

            int j = i -1;
            while(j >= 0 && list[j] > currentValue){
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = currentValue;

        }

    }
    //public static void
}
    //Compare value 1 to value 0 if value 1 is less than value 0 insert value 1 into the place of 0 and save value 0 as a temp variable
    //compare value 2 to value 1 then repeat until list is sorted.
    //create a while loop using a separate variable