package stringExamples;

import java.util.ArrayList;
import java.util.List;

public class URLifyAGivenString {

    public String replaceSpaces(char[] chars, int len) {
        if (chars == null) {
            return "";
        }
        int spaceCount = 0;
        int index = 0;
        // first loop, locate last position
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }

        index = len + spaceCount * 2 - 1;
        char[] arr = new char[index+1];
        // second loop, replace spaces from the end
        for (int i = len - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                arr[index] = '0';
                arr[index - 1] = '2';
                arr[index - 2] = '%';
                index -= 3;
            } else {
                arr[index] = chars[i];
                index--;
            }
        }
        return new String(arr).trim();
    }

    public static void main(String[] args) {
        URLifyAGivenString u = new URLifyAGivenString();
        char[] chars = "Mr John Smith       ".toCharArray();
        System.out.println(u.replaceSpaces(chars, 13));
    }
}
