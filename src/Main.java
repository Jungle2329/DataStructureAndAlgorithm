import java.util.Random;

import data_structure.array.NoOrdArray;
import data_structure.array.OrdArray;

public class Main {

    public static void main(String[] args) {
//        test2();
//        test3();
        test4();
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
}
