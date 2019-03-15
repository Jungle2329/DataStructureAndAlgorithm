package data_structure.array;


import java.util.Arrays;

/**
 * Created by Jungle on 2019/3/13 0013.
 *
 * @author JungleZhang
 * @version 1.0.0
 * @Description 有序数组
 */
public class OrdArray {

    private int[] arr;
    private int lenght = 0;

    public OrdArray(int size) {
        arr = new int[size];
    }

    /**
     * 普通插入
     * 时间复杂度O(N)
     */
    public boolean insert(int num) {
        int location = 0;
        for (; location < lenght; location++) {
            if (num < arr[location])
                break;
        }
        // 把数据向后移动一位
        boolean isSuccess = false;
        try {
            System.arraycopy(arr, location, arr, location + 1, lenght - location);
            arr[location] = num;
            isSuccess = true;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        lenght++;
        return isSuccess;
    }

    /**
     * 使用二分查找法插入
     * 还有问题
     */
    public boolean insertNew(int num) {
        if (lenght == 0) {
            arr[0] = num;
            lenght++;
            return true;
        }
        int max = lenght - 1;
        int min = 0;
        int curLoc = 0;
        while (true) {
            curLoc = (max + min) / 2;
            if (arr[curLoc] == num) {
                return false;
            } else if (max <= 0) {
                curLoc = 0;
                break;
            } else if (min > max) {//直接放在最后一位
                curLoc = lenght;
                arr[curLoc] = num;
                return true;
            } else if (max - min == curLoc) {
                //找到了这个数应该在的位置
                break;
            } else {
                if (arr[curLoc] > num) {
                    max = curLoc - 1;
                } else {
                    min = curLoc + 1;
                }
            }
        }
        //后面的数向后移动
        for (int i = lenght; i > curLoc; i--) {
            arr[i] = arr[i - 1];
        }
        arr[curLoc] = num;
        lenght++;
        return true;
    }

    /**
     * 使用二分查找法
     * 时间复杂度 O(logN)
     */
    public int select(int num) {
        int max = lenght - 1;
        int min = 0;
        int curLoc;
        while (true) {
            curLoc = (max + min) / 2;
            if (arr[curLoc] == num) {
                return curLoc;
            } else if (max < min) {
                return -1;
            } else {
                if (arr[curLoc] > num) {//上半区
                    max = curLoc - 1;
                } else {//下半区
                    min = curLoc + 1;
                }
            }
        }
    }

    /**
     * 顺序查找
     * 时间复杂度O(N)
     */
    public int indexOf(int num) {
        for (int i = 0; i < lenght; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }


    public boolean delete(int num) {
        int index = select(num);
        if (index == -1) {
            return false;
        } else {
            System.arraycopy(arr, index + 1, arr, index, lenght - index - 1);
            arr[lenght - 1] = 0;
            lenght--;
            return true;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
