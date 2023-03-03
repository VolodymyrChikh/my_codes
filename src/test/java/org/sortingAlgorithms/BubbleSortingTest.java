package org.sortingAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class BubbleSortingTest {

    List<Double> sorted = Arrays.asList(-1.1, 5., 45.5, 55., 805.);
    List<Double> unsorted = Arrays.asList(55., 5., 805., -1.1, 45.5);

    @Test
    void sortSimpleList(){
        BubbleSorting bubbleSorting = new BubbleSorting();
        assertThat(sorted, is(bubbleSorting.execute(unsorted)));
    }
}