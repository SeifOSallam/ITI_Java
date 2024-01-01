import java.io.*;
import java.util.*;

public class Anagrams {

    public static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        String tempS = new String(sArr);
        String tempT = new String(tArr);
        //System.out.println(tempS);
        //System.out.println(tempT);
        return (tempS.equals(tempT));
    }

    public static void main(String[] args) {
        System.out.println(checkAnagram("listen", "silent"));
        System.out.println(checkAnagram("Listen", "silent"));
        System.out.println(checkAnagram("liste", "silent"));
    }
}
