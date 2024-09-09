import java.util.*;

public class BinToDec {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal number : ");
        int num = sc.nextInt();
        int dec = 0;
        int pow = 1;
        while (num > 0) {
            int rem = num % 2;
            num = num / 2;
            dec = dec + (rem * pow);
            pow = pow * 10;
        }
    }
}
