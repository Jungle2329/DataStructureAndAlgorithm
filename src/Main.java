import java.util.Random;

import data_structure.array.NoOrdArray;
import data_structure.array.OrdArray;
import data_structure.quene.Queue;
import data_structure.stack.BracketChecker;

public class Main {

    public static void main(String[] args) {
        test6();
    }

    private static void test1() {
        OrdArray arr = new OrdArray(20);
        arr.insertNew(5);
        arr.insertNew(2);
        arr.insertNew(1);
        arr.insertNew(3);
        arr.insertNew(4);
        arr.insertNew(6);
        arr.insertNew(8);
        arr.insertNew(99);
        arr.delete(3);
        arr.delete(8);
        arr.delete(333);
        arr.insertNew(0);
        arr.insertNew(32);
        System.out.println(arr.toString());
        System.out.println(arr.select(4));
        System.out.println(arr.indexOf(4));
    }

    private static void test2() {
        NoOrdArray arr = new NoOrdArray(10);
        for (int i = 0; i < 10; i++) {
            Random f = new Random();
            arr.insert(f.nextInt(10));
        }
        arr.display();
        arr.bubbleSort();
        arr.display();
    }

    private static void test3() {
        NoOrdArray arr = new NoOrdArray(10);
        for (int i = 0; i < 10; i++) {
            Random f = new Random();
            arr.insert(f.nextInt(10));
        }
        arr.display();
        arr.selectSort();
        arr.display();
    }

    private static void test4() {
        NoOrdArray arr = new NoOrdArray(10);
        for (int i = 0; i < 10; i++) {
            Random f = new Random();
            arr.insert(f.nextInt(10));
        }
        arr.display();
        arr.insertSort();
        arr.display();
    }

    private static void test5() {
        String str = "f{f[ff(f)f]f}ff";
        BracketChecker bracketChecker = new BracketChecker(str);
        System.out.println(bracketChecker.check());
    }

    private static void test6() {
        Queue mQueue = new Queue(5);
        mQueue.insert(3);
        mQueue.peek();
        mQueue.insert(5);
        mQueue.peek();
        mQueue.insert(7);
        mQueue.peek();
        mQueue.insert(9);
        mQueue.peek();
        mQueue.remove();
        mQueue.peek();
        mQueue.remove();
        mQueue.peek();
        mQueue.remove();
        mQueue.peek();
        mQueue.insert(11);
        mQueue.peek();
        mQueue.insert(13);
        mQueue.peek();
        mQueue.insert(15);
        mQueue.peek();
        mQueue.insert(17);
        mQueue.remove();
        mQueue.peek();
        mQueue.remove();
        mQueue.peek();
    }
}
