import java.util.*;

/**
 * 字符串反转
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            System.out.print(c);
        }
    }
}
