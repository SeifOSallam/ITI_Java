package Lesson_6;

public class Main {
    public static void main(String[] args) {
        MyMethods methods = new MyMethods();
        try {
            System.out.println(methods.getElement(8));
        }catch(MyException e) {
            System.out.println("Getting index out of bounds");
            e.printStackTrace();
        }
        finally {
            System.out.println("WE DONE");
        }
        try {
            System.out.println(methods.getElement(10));
        }catch(MyException e) {
            System.out.println("Getting index out of bounds");
            e.printStackTrace();
        }
        finally {
            System.out.println("WE DONE");
        }
///////////////////////////////////
        try {
            methods.setElement(7, 15);
            System.out.println("Element of index " + 7 + " was set to " + 15);
        }catch(MyException e) {
            System.out.println("Setting index out of bounds");
        }
        finally {
            System.out.println("WE DONE");
        }

        try {
            methods.setElement(10, 15);
        }catch(MyException e) {
            System.out.println("Setting index out of bounds");
        }
        finally {
            System.out.println("WE DONE");
        }
///////////////////////////////////
        try {
            methods.printNElements(10);
        }catch(MyException e) {
            System.out.println("Array doesn't have more than 10 elements");
        }
        finally {
            System.out.println("WE DONE");
        }

        try {
            methods.printNElements(50);
        }catch(MyException e) {
            System.out.println("Array doesn't have more than 10 elements");
            e.printStackTrace();
        }
        finally {
            System.out.println("WE DONE");
        }

    }

}
