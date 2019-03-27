package data_structure.stack;

/**
 * Created by Jungle on 2019/3/27 0027.
 *
 * @author JungleZhang
 * @version 1.0.0
 * 数组实现的栈结构
 * 栈的效率：
 * 出栈和入栈的时间复杂度都 = O(1)
 * 也就是说，栈的操作所耗时间不依赖于栈中的数据项个数，因此操作时间很短。栈不需要比较和移动操作
 * 这里只是演示，有角标越界的Bug
 */

public class ArrayStacks {

    private char[] stack;
    private int position;

    public ArrayStacks(int size) {
        stack = new char[size];
        position = -1;
    }

    public void push(char num) throws ArrayIndexOutOfBoundsException {
        stack[++position] = num;
    }

    public char pop() throws ArrayIndexOutOfBoundsException {
        return stack[position--];
    }

    public void display() {
        System.out.println(stack[position - 1]);
    }
}
