import java.util.*;

public class ShortestPath {
    public static int shortestPaths(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            switch (ch) {
                case 'w':
                    x--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                default:
                    System.out.println("Not path");
            }
        }
        return (int) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String args[]) {
        String path = "wneenesennneee";
        System.out.println(shortestPaths(path));
    }
}
