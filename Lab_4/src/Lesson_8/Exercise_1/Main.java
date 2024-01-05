package Lesson_8.Exercise_1;
import java.io.*;
import java.util.*;
import java.util.function.*;

public class Main {

    public static Predicate<String> myPredicate() {
        return (str1) -> (str1.equalsIgnoreCase("better"));
    }
    public static String betterString(String s1, String s2,
                                      Predicate<String> checkBetter) {
        return checkBetter.test(s1) ? s1 : s2;
    }
    public static void main(String[] args) {
        System.out.println(betterString("Beter", "hello", myPredicate()));
    }
}
