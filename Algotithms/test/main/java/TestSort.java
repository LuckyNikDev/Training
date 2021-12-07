package main.java;

import main.java.sorts.Sorts;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSort {
    private Sorts sorts = new Sorts();

    @Test
    public void bubbleSortTest() {
        int[] expecteds = {-8, 0, 2, 5, 7, 14, 14};
        int[] sourse = {14, 0, 7, 14, -8, 5, 2};
        sorts.bubleSort(sourse);
        Assert.assertArrayEquals(expecteds, sourse);
    }

    @Test
    public void selectionSortTest() {
        int[] expecteds = {-8, 0, 2, 5, 7, 14, 14};
        int[] sourse = {14, 0, 7, 14, -8, 5, 2};
        sorts.selectionSort(sourse);
        Assert.assertArrayEquals(expecteds, sourse);
    }

    @Test
    public void insertionSortTest() {
        int[] expecteds = {-8, 0, 2, 5, 7, 14, 14};
        int[] sourse = {14, 0, 7, 14, -8, 5, 2};
        sorts.insertionSort(sourse);
        Assert.assertArrayEquals(expecteds, sourse);
    }

    @Test
    public void quickSortTest() {
        int[] expecteds = {-8, 0, 2, 5, 7, 14, 14};
        int[] sourse = {14, 0, 7, 14, -8, 5, 2};
        sorts.quickSort(sourse, 0, sourse.length - 1);
        Assert.assertArrayEquals(expecteds, sourse);
    }

}
