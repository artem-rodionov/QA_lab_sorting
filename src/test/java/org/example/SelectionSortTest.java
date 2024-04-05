package org.example;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Artem
 */
public class SelectionSortTest {

    @Test
    public void selectionSortGoodArray() {
        int []arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectionSort.selectionSort(arr);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }

    @Test
    public void selectionSortEmptyArray() {
        int []arr = {};
        SelectionSort.selectionSort(arr);
        Assert.assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void selectionSortOneElementArray() {
        int []arr = {1};
        SelectionSort.selectionSort(arr);
        Assert.assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    public void selectionSortSameElementsArray() {
        int []arr = {1, 1, 1, 1, 1};
        SelectionSort.selectionSort(arr);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, arr);
    }

    @Test
    public void selectionSortRandomElementsArray() {
        int []arr = {22, 35, 76, 49, 19, 13, 72, 34, 26, 53, 8, 59, 73, 90, 48, 82, 30, 15, 83, 6};
        SelectionSort.selectionSort(arr);
        Assert.assertArrayEquals(new int[]{6, 8, 13, 15, 19, 22, 26, 30, 34, 35, 48, 49, 53, 59, 72, 73, 76, 82, 83, 90}, arr);
    }
}