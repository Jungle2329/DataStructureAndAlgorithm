package data_structure.array;

import java.util.Arrays;

import algorithm.sort.BubbleSort;
import algorithm.sort.SelectSort;

/**
 * Created by Jungle on 2019/3/15 0015.
 *
 * @author JungleZhang
 * @version 1.0.0
 * @Description
 */

public class BubArray {
    private long[] arr;
    private int length = 0;

    public BubArray(int size) {
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

}
