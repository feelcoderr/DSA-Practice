public class FastExpo {
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        int a = 2, n = 5;
        System.out.println(fastExpo(a, n));
    }
}
