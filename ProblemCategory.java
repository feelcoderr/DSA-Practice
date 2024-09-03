
/*
Chef prepared a problem. The admin has rated this problem for x points.
 * Easy if 
1
≤
x
<
100
1≤x<100

Medium if 
100
≤
x
<
200
100≤x<200

Hard if 
200
≤
x
≤
300
200≤x≤300
 */
import java.util.*;

public class ProblemCategory {
    public static String problemCate(int x) {
        if (1 >= x && x < 100) {
            return "Easy";
        } else if (x < 200) {
            return "Medium";
        } else {
            return "Hard";
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(problemCate(x));
    }
}