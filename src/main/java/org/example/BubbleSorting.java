package org.example;

import java.util.List;

public class BubbleSorting {

    static List<Double> bubbleSort(List<Double> list){

        boolean ckeck = true;

        for(int i = 0; i < list.size() && ckeck; ++i){

            ckeck = false;

            for (int j = 0; j < list.size() - 1;++j){

                if (list.get(j) > list.get(j + 1)){
                    double temp = list.get(j);
                    list.set(j, list.get(j+1)) ;
                    list.set(j+1, temp) ;
                    ckeck = true;
                }
            }
        }
        return list;
    }


}
