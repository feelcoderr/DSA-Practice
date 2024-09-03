import javax.print.event.PrintJobListener;

public class diagonalSum {
    public static void main(String args[]) {
        int n = 4;
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int ps = 0, ss = 0;
        for (int i = 0; i < n; i++) {
            ps = ps + matrix[i][i];
            ss = ss + matrix[i][n - i - 1];
        }
        if (n % 2 == 0) {
            System.out.println(ps + ss);
        } else {
            System.out.println(ps + ss - matrix[n / 2][n / 2]);
        }
    }
}
