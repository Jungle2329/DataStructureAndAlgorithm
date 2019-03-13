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
     * 使用二分查找法
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
