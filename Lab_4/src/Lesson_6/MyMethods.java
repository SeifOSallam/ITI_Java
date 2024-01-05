package Lesson_6;

public class MyMethods {
    int[] myarr;
    MyMethods() {
        myarr = new int[10];
        for (int i=0;i<10;i++) {
            myarr[i] = i+1;
        }
    }
    public int getElement(int index) {
        if (index >= 10) {
            throw new MyException();
        }
        else {
            return myarr[index];
        }
    }
    public void setElement(int index, int value) {

        if (index >= 10) {
            throw new MyException();
        }
        else {
            myarr[index] = value;
        }
    }
    public void printNElements(int num) {
        if (num > 10) {
            throw new MyException();
        }
        else {
            for (int i : myarr) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}
