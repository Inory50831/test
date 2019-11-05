import java.util.*;

/**
 * 等差数列test
 */
public class Test01{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int i = in.nextInt();
            if(i<1){
                System.out.println(-1);
            }else{
                System.out.println(2*i+3*i*(i-1)/2);
            }
        }
        in.close();
    }
}

