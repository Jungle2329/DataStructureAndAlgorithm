package data_structure.quene;

import java.util.Arrays;

/**
 * Created by Jungle on 2019/3/28 0028.
 *
 * @author JungleZhang
 * @version 1.0.0
 * @Description 队列
 */

public class Queue {

    private int maxSize;
    //头
    private int front;
    //尾
    private int rear;
    private int mItems;
    private long[] queArray;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        front = 0;
        rear = 0;
        mItems = 0;
    }

    /**
     * 插入队尾
     */
    public void insert(long num) {
        if (!isFull()) {
            if (rear > maxSize - 1) {
                rear = 0;
            }
            queArray[rear++] = num;
            mItems++;
        } else {
            System.out.println("队列已满");
        }
    }

    /**
     * 从队头移除
     */
    public void remove() {
        if (!isEmpty()) {
            if (front == maxSize - 1) {
                front = 0;
            } else {
                front++;
            }
            mItems--;
        } else {
            System.out.println("队列为空");
        }

    }

    /**
     * 返回队头数据
     */
    public void peek() {
        System.out.println("队头:" + front);
        System.out.println("队列:" + Arrays.toString(queArray));
        System.out.println("队尾:" + rear);
    }

    /**
     * 队列满
     */
    public boolean isFull() {
        return mItems == maxSize;
    }

    /**
     * 队列空
     */
    public boolean isEmpty() {
        return mItems == 0;
    }

    /**
     * 数据个数
     */
    public int size() {
        return mItems;
    }
}
