package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianofTwoSortedArrays {

    public double findMedian(int[] array1, int[] array2) {
        int [] finalArray = new int[array1.length+array2.length];
        int firstArrayIndex =0,secondArrayIndex = 0, finalArrayIndex = -1;
        for(;firstArrayIndex < array1.length && secondArrayIndex < array2.length;){
            if(array1[firstArrayIndex] <= array2[secondArrayIndex]){
                finalArray[++finalArrayIndex] = array1[firstArrayIndex];
                firstArrayIndex++;
            }
            else {
                finalArray[++finalArrayIndex] = array2[secondArrayIndex];
                secondArrayIndex++;
            }
        }
            for(;firstArrayIndex< array1.length;firstArrayIndex++){
                finalArray[++finalArrayIndex] = array1[firstArrayIndex];
            }
        for(;secondArrayIndex < array2.length;secondArrayIndex++)
            finalArray[++finalArrayIndex] = array2[secondArrayIndex];
        if(finalArrayIndex %2 == 0)
         return finalArray[finalArrayIndex/2];
        else if(finalArrayIndex %2  ==1)
            return (double) (finalArray[finalArrayIndex/2] + finalArray[(finalArrayIndex/2+1)])/2;
        else
            return 0;
    }
}