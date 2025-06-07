import java.util.Arrays;

public class FirstUniqueElement {

    public static int firstUniqChar(String s) {
        char[] charArray = s.toCharArray();
        boolean[] booleans = new boolean[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            int c = 1;
            if (booleans[i]) continue;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    booleans[j] = true;
                    c++;
                }
            }
            System.out.println(Arrays.toString(booleans));
            if (c == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aadadaad"));
    }
}
