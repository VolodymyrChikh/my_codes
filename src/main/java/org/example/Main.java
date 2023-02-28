package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Bubble sorting
        System.out.println("\n--- Bubble Sorting --- ");
        List<Double> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(15.);
        listOfNumbers.add(20.5);
        listOfNumbers.add(5.);
        listOfNumbers.add(665.);
        listOfNumbers.add(1001.);
        listOfNumbers.add(100.);
        listOfNumbers.add(55.);
        listOfNumbers.add(2.1);
        listOfNumbers.add(1.);
        listOfNumbers.add(0.236);

        System.out.println("1) Unsorted list: " + listOfNumbers);
        BubbleSorting.bubbleSort(listOfNumbers);
        System.out.println("2) Sorted list: " + listOfNumbers);

        System.out.println("\n================================\n");

        // Bucket sorting
        System.out.println("--- Bucket Sorting --- ");
        double[] arrayOfNumbers = {15.5, 20, -5, 665, -1001, 100.4, 55, 2, 1, 0.252};
        int numberOfBuckets = 4;
        System.out.println("1) Unsorted array: " + Arrays.toString(arrayOfNumbers));
        BucketSorting.bucketSort(arrayOfNumbers, numberOfBuckets);
        System.out.println("2) Sorted array: " + Arrays.toString(arrayOfNumbers));



    }
}