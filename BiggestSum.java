import java.util.*;

public class BiggestSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x + y > y + z) {
            if (x + y > x + z) {
                System.out.println(x + y);
            } else {
                System.out.println(x + z);
            }
        } else {
            if (y + z > x + z) {
                System.out.println(y + z);
            } else {
                System.out.println(x + z);
            }
        }

    }
}