import java.util.*;
import java.util.HashMap;

public class UniqeRange {
    public static void main(String args[]) {
        int a = 2;
        int b = 5;
        int c = 3;
        int d = 8;

        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 1;
        for (int i = a; i <= b; i++) {
            hm.put(i, count);
            count++;
        }
        for (int i = c; i <= d; i++) {
            hm.put(i, count);
            count++;
        }
        System.out.println(hm.size());
    }
}
