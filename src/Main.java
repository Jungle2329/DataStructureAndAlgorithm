import data_structure.array.OrdArray;

public class Main {

    public static void main(String[] args) {
        OrdArray arr = new OrdArray(8);
        arr.insert(5);
        arr.insert(2);
        arr.insert(1);
        arr.insert(3);
        arr.insert(4);
        arr.insert(6);
        arr.insert(8);
        arr.insert(99);
        arr.delete(3);
        arr.delete(8);
        arr.delete(333);
        arr.insert(0);
        arr.insert(32);
        System.out.println(arr.toString());
        System.out.println(arr.select(4));
        System.out.println(arr.indexOf(4));
    }
}
