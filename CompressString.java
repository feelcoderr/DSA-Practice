public class CompressString {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i + 1) == ch) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(ch);
                sb.append(count);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "aaabbbcdde";
        System.out.println(compress(str));
    }
}
