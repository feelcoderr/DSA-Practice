public class SpiralMatrix {
    public static void main(String args[]) {
        int n = 4, m = 4;
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int colStart = 0, colEnd = n - 1, rowStart = 0, rowEnd = m - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i < colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            for (int i = rowStart; i < rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            for (int i = colEnd; i > colStart; i--) {
                if (rowStart == rowEnd) {
                    break;
                }
                System.out.print(matrix[rowEnd][i] + " ");
            }
            for (int i = rowEnd; i > rowStart; i--) {
                if (colStart == colEnd) {
                    break;
                }
                System.out.print(matrix[i][colStart] + " ");
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }

    }
}
