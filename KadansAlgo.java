public class KadansAlgo {
    public static int kadan(int numbers[]) {
        int cs = numbers[0];
        int mn = Integer.MIN_VALUE;
        int ms = Integer.MIN_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < 0 && numbers[i] > mn) {
                mn = numbers[i];
            }
            cs += numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        if (ms > 0) {
            return ms;
        } else {
            return mn;
        }

    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, -4, -2, -5, -3 };
        System.out.println(kadan(numbers));
    }
}