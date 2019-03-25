package algorithm.sort;

/**
 * Created by Jungle on 2019/3/15 0015.
 *
 * @author JungleZhang
 * @version 1.0.0
 * @Description 冒泡排序
 */

public class BubbleSort {

    /**
     * 冒泡排序
     * 时间复杂度
     * = (N - 1) + (N - 2) + (N - 3) + ... + 1
     * = (N * (N - 1) / 2
     * = (N ^ 2 - N) / 2
     * 平均需要再次 / 2
     * = (N ^ 2 - N) / 4
     * = O(N^2)
     * <p>
     * 无论何时，只要看到一个循环嵌套在另一个循环里，例如在冒泡排序和本章的其他排序算法中
     * 就可以怀疑这个算法的运行时间为O(N^2)级别。外层循环执行N次，内部循环对于每次外层循环
     * 都执行N次（或者几分之N次）。这就意味着大约需要执行N^2次
     */
    public long[] bubbleSort(long[] arr) {
        long temp;
        for (int i = arr.length - 1; i > 0; i--) {// 控制循环次数
            for (int j = 0; j < i; j++) {// 控制当次循环
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
