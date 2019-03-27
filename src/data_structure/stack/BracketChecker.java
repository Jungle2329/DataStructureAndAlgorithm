package data_structure.stack;

/**
 * Created by Jungle on 2019/3/27 0027.
 *
 * @author JungleZhang
 * @version 1.0.0
 * @Description 利用栈结构验证括号的正确性
 */

public class BracketChecker {

    private String str;

    public BracketChecker(String str) {
        this.str = str;
    }

    public String check() {
        ArrayStacks as = new ArrayStacks(str.length());

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    as.push(c);
                    break;
                case '}':
                    if (as.pop() != '{') {
                        return "Error } at " + i;
                    }
                    break;
                case ']':
                    if (as.pop() != '[') {
                        return "Error } at " + i;
                    }
                    break;
                case ')':
                    if (as.pop() != '(') {
                        return "Error } at " + i;
                    }
                    break;
            }
        }
        return "is it right";
    }
}
