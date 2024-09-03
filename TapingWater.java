public class TapingWater {
    public static int maxTapingWater(int h[]) {
        int lmax[] = new int[h.length];
        int rmax[] = new int[h.length];

        int left = 0;
        int right = 0;
        for (int i = 0; i < h.length; i++) {
            lmax[i] = Math.max(left, h[i]);
            left = lmax[i];
            rmax[h.length - 1 - i] = Math.max(right, h[h.length - 1 - i]);
            right = rmax[h.length - 1 - i];
        }
        int water = 0;
        for (int i = 0; i < h.length; i++) {
            if (Math.min(lmax[i], rmax[i]) - h[i] > 0) {
                water += Math.min(lmax[i], rmax[i]) - h[i];
            }
        }
        return water;
    }

    public static void main(String args[]) {
        int h[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(maxTapingWater(h));
    }
}
