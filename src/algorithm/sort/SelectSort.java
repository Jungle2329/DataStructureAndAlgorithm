package algorithm.sort;

/**
 * Created by Jungle on 2019/3/19 0019.
 *
 * @author JungleZhang
 * @version 1.0.0
 * @Description 选择排序
 */

public class SelectSort {

    /**
     * 选择排序
     * 是冒泡排序的优化版本，优化节省了交换时间，但是比较时间没有变
     *
     * 交换时间为小于arr.length()次
     * 循环比较时间依然是O(N^2)次
     * 所以时间复杂度依然是O(N^2)
     * 相比冒泡排序一定会更快，量级越大越明显，交换比比较是更耗时间的
     */
    public long[] selectSort(long[] arr) {
        int i, j;
        long temp;
        int min;
        for (i = 0; i < arr.length - 1; i++) {
            min = i;
            for (j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

}
