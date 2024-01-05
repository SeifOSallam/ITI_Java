package Lesson_8.Exercise_2;
import java.io.*;
import java.util.*;
import java.util.function.*;

public class Main {

    public static Predicate<String> lettersPredicate() {
        return (s) -> {
            for (int i=0;i<s.length();i++) {
                if (!Character.isLetter(s.charAt(i))) {
                    return false;
                }
            }
            return true;
        };
    }

    public static boolean alphaString (String s, Predicate<String> predFunction) {
        return predFunction.test(s);
    }

    public static void main(String[] args) {
        System.out.println(alphaString("ahmed", lettersPredicate()));
    }
}
