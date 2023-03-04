package org.sortingAlgorithms;

import java.util.Arrays;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Bubble sorting
        System.out.println("\n--- Bubble Sorting --- ");
        List<Double> listOfNumbers = List.of(15., 20.5, 5., 665., 665., 1001., 100., 55., 2.1, 1., 0.236);

        System.out.println("1) Unsorted list: " + listOfNumbers);
        BubbleSorting.execute(listOfNumbers);
        System.out.println("2) Sorted list: " + listOfNumbers);

        System.out.println("\n================================\n");

        // Bucket sorting
        System.out.println("--- Bucket Sorting --- ");
        double[] arrayOfNumbers = {15.5, 20, -5, 665, -1001, 100.4, 55, 2, 1, 0.252};
        System.out.println("1) Unsorted array: " + Arrays.toString(arrayOfNumbers));
        BucketSorting.execute(arrayOfNumbers);
        System.out.println("2) Sorted array: " + Arrays.toString(arrayOfNumbers));
    }
}