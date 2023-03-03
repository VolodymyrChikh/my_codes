package org.sortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class BubbleSorting {
    static List<Double> execute(List<Double> list){
        List<Double> mutableList = new ArrayList<>(list);
        boolean ckeck = true;
        for(int i = 0; i < mutableList.size() && ckeck; ++i){
            ckeck = false;
            for (int j = 0; j < mutableList.size() - 1; ++j){
                if (mutableList.get(j) > mutableList.get(j + 1)){
                    double temp = mutableList.get(j);
                    mutableList.set(j, mutableList.get(j+1)) ;
                    mutableList.set(j+1, temp) ;
                    ckeck = true;
                }
            }
        }
        return mutableList;
    }
}