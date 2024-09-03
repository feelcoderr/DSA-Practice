import java.util.*;

public class BuySellStock {
    public static boolean isDuplicate(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int price[] = { 7, 1, 3, 3, 6, 4 };
        System.out.println(isDuplicate(price));
        System.out.println(~(99));
    }
}
