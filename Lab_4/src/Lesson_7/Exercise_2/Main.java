package Lesson_7.Exercise_2;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Complex<Integer> myComplex = new Complex<>(5,10);
        System.out.println(myComplex.add(new Complex<Integer>(10,20)).getReal());
        System.out.println(myComplex.add(new Complex<Integer>(10,20)).getImg());

        System.out.println("------------------");

        Complex<Double> myComplex2 = new Complex<>(5.10,10.35);
        System.out.println(myComplex2.add(new Complex<Double>(10.55,20.20)).getReal());
        System.out.println(myComplex2.add(new Complex<Double>(10.4,20.31)).getImg());
        //System.out.println(myComplex2.add(new Complex<Float>(10.4F,20.31F)).getImg());
        System.out.println("------------------");
        ComplexInterface<Double> myDoubleComplex = new DoubleComplex(3.14,5.9);
        myDoubleComplex.add(new DoubleComplex(10.0, 20.0)).printComplex();
        myDoubleComplex.add(new DoubleComplex(10.0, -20.0)).printComplex();
        myDoubleComplex.multiply(new DoubleComplex(10.0, 20.0)).printComplex();
        myDoubleComplex.sub(new DoubleComplex(3.0, 5.0)).printComplex();
        try {
            myDoubleComplex.divide(new DoubleComplex(0.0, -20.0)).printComplex();
        }catch(Exception e) {
            System.out.println("Cannot divide by zero");
        }
        try {
            myDoubleComplex.divide(new DoubleComplex(10.0, 0.0)).printComplex();
        }catch(Exception e) {
            System.out.println("Cannot divide by zero");
        }
        try {
            myDoubleComplex.divide(new DoubleComplex(2.0, 2.0)).printComplex();
        }catch(Exception e) {
            System.out.println("Cannot divide by zero");
        }


    }
}
