package Lesson_7.Exercise_1;
import java.io.*;
import java.util.*;


public class Main {

    public static void printList(List<? extends Shape> myList) {
        for (Shape s : myList) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Shape> myList = new ArrayList<>();
        myList.add(new Circle());
        myList.add(new Rectangle());
        myList.add(new Rectangle());
        myList.add(new Circle());
        myList.add(new Circle());
        printList(myList);

        //List<Object> testList = new ArrayList<>();
        //printList(testList);
        //List<Integer> testList2 = new ArrayList<>();
        //printList(testList2);
    }

}
