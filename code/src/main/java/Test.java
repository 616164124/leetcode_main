import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(isa("fuheia", "fuheia"));
    }

    public static boolean isa(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] charst = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(charst);
        return Arrays.equals(chars, charst);
    }
}
