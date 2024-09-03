public class Handsack {
    public static void main(String args[]) {
        int people = 9;

        // number of handsack=(people*(people-1))/2
        int handsack = (people * (people - 1)) / 2;
        System.out.println(handsack);

        int mask = 0x0000c;
        int num = 0x209;
        System.out.println(mask);
        System.out.println(num);
        System.out.println(mask & num);
    }
}
