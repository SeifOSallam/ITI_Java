import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Lesson3 {

    public static int Method1(String s, String t) {
        if (t.equals("")) {
            return 0;
        }
        String[] words = s.split(" ");
        int occ = 0;
        for (String word : words) {
            if (t.equals(word)) {
                occ++;
            }
        }
        return occ;
    }
    public static int Method2(String s, String t) {
        if (t.equals("")) {
            return 0;
        }
        String tempString = new String(s);
        int occ = 0;
        int tempLength = tempString.length();
        while (true) {
            tempString = tempString.replaceFirst(t, "");
            if (tempString.length() == tempLength) {
                break;
            }
            else {
                occ++;
                tempLength = tempString.length();
            }

        }
        return occ;
    }
    public static int Method2V2(String s, String t) { // INDEX OF
        if (t.equals("")) {
            return 0;
        }
        int occ = 0;
        int pos = 0;

        while (true) {
            pos = s.indexOf(t, pos);
            if (pos != -1) {
                occ++;
                pos++;
            }
            else {
                break;
            }
        }
        return occ;
    }
    public static int Method2V3(String s, String t) { // SUBSTR
        if (t.equals("")) {
            return 0;
        }
        int occ = 0;
        int currindex = 0;
        while (currindex < s.length()) {
            if (s.charAt(currindex) == t.charAt(0)) {
                String sub = s.substring(currindex, currindex+t.length());
                currindex += t.length();
                occ++;
            }
            else {
                currindex++;
            }

        }
        return occ;
    }

    public static int getTokenOcc(String s, String t) {
        int occ = 0;
        StringTokenizer myTokenizer = new StringTokenizer(s, " ");

        while(myTokenizer.hasMoreTokens()) {
            String tempStr = myTokenizer.nextToken();
            if (tempStr.equals(t)) {
                occ++;
            }
        }
        return occ;
    }
    public static int regexOcc(String s, String t) {
        int occ = 0;
        String myregex = "\\b" + t + "\\b";
        Pattern pattern = Pattern.compile(myregex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            occ++;
        }
        return occ;
    }
    public static void main(String[] args) {
        String s = "This is a veryvery very very    Very long sentence, It goes everywhere! That's very weird.";
        System.out.println("First method: " + Method1(s, "very"));
        System.out.println("Second method: " + Method2(s, "very"));
        System.out.println("Second method version 2: " + Method2V2(s, "very"));
        System.out.println("Second method version 3: " + Method2V3(s, "very"));
        System.out.println("Using StringTokenizer: " + getTokenOcc(s, "very"));
        System.out.println("Using Regex: " + regexOcc(s, "very"));

    }
}
