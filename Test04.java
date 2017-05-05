import java.util.*;

/**
 * 数字颠倒
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = n +"";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            System.out.print(c);
        }
    }
}
