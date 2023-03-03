package org.sortingAlgorithms;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class BucketSortingTest {
    double[] sorted = {-45.5, -1.1, 5., 55., 805.};
    double[] unsorted = {55., 5., 805., -1.1, -45.5};

    @Test
    void sortSimpleArray(){
        BucketSorting bucketSorting = new BucketSorting();
        assertThat(sorted, is(bucketSorting.execute(unsorted)));
    }

}