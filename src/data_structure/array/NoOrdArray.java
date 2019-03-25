package data_structure.array;

import java.util.Arrays;

import algorithm.sort.BubbleSort;
import algorithm.sort.InsertSort;
import algorithm.sort.SelectSort;

/**
 * Created by Jungle on 2019/3/15 0015.
 *
 * @author JungleZhang
 * @version 1.0.0
 * @Description 无序数组
 */

public class NoOrdArray {
    private long[] arr;
    private int length = 0;

    public NoOrdArray(int size) {
        arr = new long[size];
    }

    public void insert(long num) {
        arr[length] = num;
        length++;
    }

    public void display() {
        System.out.println(Arrays.toString(arr));
    }

    public void bubbleSort() {
        BubbleSort b = new BubbleSort();
        arr = b.bubbleSort(arr);
    }

    public void selectSort() {
        SelectSort b = new SelectSort();
        arr = b.selectSort(arr);
    }

    public void insertSort() {
        InsertSort b = new InsertSort();
        arr = b.insertSort(arr);
    }

}
