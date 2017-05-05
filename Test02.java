import java.util.Scanner;

/**
 * 最小公倍数
 */
public class Test02 {
    public static int getResult(int i ,int j){
        int temp;
        if(i < j){
            temp = i;
            i = j;
            j = temp;
        }
        int k;
        while(j != 0){
            k = i % j;
            i = j;
            j = k;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int i = in.nextInt();
            int j = in.nextInt();
            System.out.println(i*j/getResult(i, j));
        }

    }

}