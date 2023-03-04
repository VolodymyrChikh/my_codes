package org.sortingAlgorithms;

import java.util.*;


public class BucketSorting {
    static double[] execute(double[] arrayOfNumbers) {
        // Find the maximum value in the array
        double max = Arrays.stream(arrayOfNumbers).max().getAsDouble();
        double min = Arrays.stream(arrayOfNumbers).min().getAsDouble();

        // declaring the number of buckets
        int numberOfBuckets = 4;

        // create range of buckets
        double range = (max - min + 1) / numberOfBuckets;

        // creating buckets
        List<List<Double>> buckets = new ArrayList<>();

        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int bucketIndex = (int) ((int) (arrayOfNumbers[i] - min) / range);
            buckets.get(bucketIndex).add(arrayOfNumbers[i]);
        }

        // Sort each bucket
        for (List<Double> bucket : buckets) {
            Collections.sort(bucket);
        }

        // merge buckets
        int index = 0;
        for (List<Double> bucket : buckets) {
            for (double num : bucket) {
                arrayOfNumbers[index++] = num;
            }
        }

        return arrayOfNumbers;
    }
}

