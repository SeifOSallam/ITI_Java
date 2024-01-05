package Lesson_7.Exercise_2;

public interface ComplexInterface<T> {

    T getReal();
    void setReal(T real);

    T getImg();
    void setImg(T img);
    ComplexInterface<T> add(ComplexInterface<T> inputComplex);
    ComplexInterface<T> sub(ComplexInterface<T> inputComplex);
    ComplexInterface<T> multiply(ComplexInterface<T> inputComplex);
    ComplexInterface<T> divide(ComplexInterface<T> inputComplex);

    void printComplex();

}
