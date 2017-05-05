import java.util.*;

public class Test07 {
    public int countWays(int x, int y) {
        if(x <= 1 && y <= 1)
            return 0;
        else if(x == 1 || y == 1)
            return 1;
        else
            return (countWays(x, y-1) + (countWays(x-1, y)));
    }
}