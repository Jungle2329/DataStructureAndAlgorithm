package algorithm.sort;

/**
 * Created by Jungle on 2019/3/19 0019.
 *
 * @author JungleZhang
 * @version 1.0.0
 * @Description 插入排序
 * 关键字：局部有序
 */

public class InsertSort {

    /**
     * 插入排序
     *
     * 插入排序的不变性：比i序号小的区间是局部有序的
     * 效率：1 + 2 + 3 + ... + N-1
     *      = ((N-1) + 1) * (N-1) / 2
     * 平均一般可以发现插入点所以 / 2
     * 最终得 (N^2) * N / 4
     * 时间复杂度 = O(N^2)
     * 复制的次数大致等于比较的次数，然而一次复制的时间要比一次交换的时间短
     * 所以，在次数差不多的时候，插入排序比冒泡排序快一倍，比选择排序略快
     *
     * 在随机数据的情况下，插入排序 时间复杂度 = O(N^2)
     * 但是在已经有序或者基本有序的情况下，插入排序要快得多。
     * 在有序的情况下 while(j > 0 && arr[j - 1] >= temp) 都是false，都不执行，只执行一轮for，时间复杂度 = O(N)
     * 在基本有序的情况下 时间复杂度也几乎 = O(N)
     *
     * 所以对于有序或者基本有序的数列，插入排序是最好的
     *
     * 但是对于逆序序列每一步都是要执行的，时间等于冒泡排序
     */
    public long[] insertSort(long[] arr) {
        int i, j;
        long temp;
        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while(j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
}
