public class searchMatrix {
    public static void main(String args[]) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int key = 39;
        int i = 0, j = matrix.length - 1;
        while (i < matrix.length && j >= 0) {
            if (key == matrix[i][j]) {
                System.out.println(i + " " + j);
                break;
            } else {
                if (matrix[i][j] < key) {
                    i++;
                } else {
                    j--;
                }
            }
        }
    }
}
