package calculation;

import java.util.Arrays;

public class Video_15 {
    public static void main(String[] args) {
        String str = "ABCD";

        // length()
        int strLength = str.length();
        System.out.println(strLength);  // 4

        // charAt(int index)
        char strChar = str.charAt(2);
        System.out.println(strChar);  // C

        // substring(int from, int to)
        String strSub = str.substring(0, 3);
        System.out.println(strSub);  // ABC

        // equals(String str)
        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);  // true

        // toCharArray() : String을 char[] 로 변환
        char[] strCharArray = str.toCharArray();

        System.out.println(str);  // ABCD
        System.out.println(strCharArray);  // ABCD

        // new String(char[] charArray) : char[]를 String로 변환
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray);

        System.out.println(charArray);  // ABC
        System.out.println(charArrayString);  // ABC
    }
}
