package Lesson_6;

public class MyException extends IndexOutOfBoundsException{
    MyException() {}
    MyException(String s) {
        super(s);
    }
}
