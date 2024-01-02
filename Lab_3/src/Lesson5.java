import java.io.*;
import java.util.*;
import java.lang.reflect.*;
public class Lesson5 {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        TestForAnnotation myTest = new TestForAnnotation();
        Class<?> testClass = myTest.getClass();
        System.out.println("Test class annotation: " + testClass.getAnnotation(Author.class));
        System.out.println("Test constructor annotation: " +
                testClass.getConstructor().getAnnotation(Author.class));
        System.out.println("Test getVar Method annotation: " +
                testClass.getMethod("getVar").getAnnotation(Author.class));
        Field[] fields = testClass.getFields();
        for (Field f : fields) {
            System.out.println("Test var member annotation: " +
                    f.getAnnotation(Author.class));
        }

    }
}
